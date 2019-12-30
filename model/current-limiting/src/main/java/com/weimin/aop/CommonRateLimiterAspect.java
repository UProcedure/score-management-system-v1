package com.weimin.aop;

import com.google.common.util.concurrent.RateLimiter;
import com.sun.org.apache.xpath.internal.SourceTree;
import com.weimin.annotation.CommonRateLimiter;
import com.weimin.controller.User;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;

/**
 * @author weimin
 * @ClassName CommonRateLimiterAspect
 * @Description TODO
 * @date 2019/12/12 14:18
 */
@Aspect
@Component
public class CommonRateLimiterAspect {

    @Bean
    public User getOldString(){
        System.out.println("User进入了。。。。。");
        return new User("mmmmmm");
    }

    @Autowired
    private HttpServletResponse response;

    private RateLimiter rateLimiter = RateLimiter.create(10);

    @Pointcut("execution(public * com.weimin.controller.*.*(..))")
    public void pointcut(){
        System.out.println();
    }

    @Around("pointcut()")
    public Object process(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("进入了Around方法。。。。。。");
        //1.获取当前方法信息
        MethodSignature signature = (MethodSignature) proceedingJoinPoint.getSignature();
        //2.获取该方法的注解信息
        CommonRateLimiter declaredAnnotation =
                signature.getMethod().getDeclaredAnnotation(CommonRateLimiter.class);
        //3.如果不存在限流注解，则直接调用业务方法
        if(declaredAnnotation == null){
            return proceedingJoinPoint.proceed();
        }
        //4.获取注解上参数信息
        double rate = declaredAnnotation.rate();
        long timeout = declaredAnnotation.timeout();
        //设置限流
        rateLimiter.setRate(rate);
        //5.判断令牌桶获取token是否超时
        boolean tryAcquire = rateLimiter.tryAcquire(timeout, TimeUnit.MILLISECONDS);
        if(!tryAcquire){
            //获取不到令牌，则降级处理
            defaultBack();
            return null;
        }
        //获取到令牌，执行业务逻辑
        return proceedingJoinPoint.proceed();
    }

    @Before("pointcut()")
    public void before(){
        System.out.println("before进入了。。。。。。");
    }

    @After("pointcut()")
    public void after(){
        System.out.println("after进入了。。。。。。");
    }

    @AfterReturning("pointcut()")
    public void afterReturn(){
        System.out.println("返回通知增强，可以用来提交事务");
    }

    @AfterThrowing("pointcut()")
    public void afterThrow(){
        System.out.println("异常aop，处理异常。。。。。。");
    }
    /**
     * 降级处理
     */
    private void defaultBack() {
        response.setHeader("Content-type", "text/html;charset=UTF-8");
        PrintWriter out = null;
        try {
            out = response.getWriter();
            out.print("当前访问人数过多，请稍后重试！");
            out.flush();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (out != null) {
                out.close();
            }
        }
    }
}
