package com.weimin.controller;

import com.weimin.annotation.CommonRateLimiter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author weimin
 * @ClassName LimitTestController
 * @Description TODO
 * @date 2019/12/12 14:21
 */
@Controller
public class LimitTestController {

    @RequestMapping("test")
    @CommonRateLimiter(rate = 1,timeout = 500)
    @ResponseBody
    public String test(String id){
        System.out.println("处理正常逻辑");
        if("throw".trim().equals(id)){
            int i= 1/0;
        }
        return "ok";
    }

}
