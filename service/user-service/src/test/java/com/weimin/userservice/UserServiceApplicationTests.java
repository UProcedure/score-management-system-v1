package com.weimin.userservice;

import com.alibaba.dubbo.config.annotation.Reference;
import com.weimin.api.IStudentService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserServiceApplicationTests {

    @Reference
    private IStudentService studentService;

    @Test
    public void contextLoads() {
        System.out.println(studentService.selectByPrimaryKey(1L));
    }

}
