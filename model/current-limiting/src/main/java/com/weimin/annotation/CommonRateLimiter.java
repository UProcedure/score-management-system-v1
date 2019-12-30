package com.weimin.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author weimin
 */
@Target(value = ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface CommonRateLimiter {

    //1.放入令牌桶的速度
    double rate();
    //2.获取令牌的超时时间
    long timeout() default 0;
}
