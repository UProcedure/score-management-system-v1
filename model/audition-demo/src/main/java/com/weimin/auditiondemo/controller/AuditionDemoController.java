package com.weimin.auditiondemo.controller;

import com.weimin.auditiondemo.entity.User;
import com.weimin.auditiondemo.service.ITestService;
import com.weimin.auditiondemo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author weimin
 * @ClassName AuditionDemoController
 * @Description TODO
 * @date 2019/12/14 20:23
 */
@RestController
public class AuditionDemoController {

    @Autowired
    private IUserService userService;
    @Autowired
    private ITestService testService;

    @RequestMapping("test")
    public String test(){
        testService.test();
        return "ok";
    }

    @RequestMapping("test2")
    public String test2(){
        testService.test2();
        return "ok";
    }
}
