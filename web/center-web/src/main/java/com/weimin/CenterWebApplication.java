package com.weimin;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @author weimin
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableDubbo
public class CenterWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(CenterWebApplication.class, args);
    }

}
