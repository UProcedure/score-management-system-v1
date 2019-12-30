package com.weimin.controller;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

/**
 * @author weimin
 * @ClassName BeanTest
 * @Description TODO
 * @date 2019/12/13 10:04
 */
@Configurable
public class BeanTest {

    @Bean
    public String getString(){
        System.out.println("进来了。。。。");
        return new String("dskfkfdlsk");
    }
}
