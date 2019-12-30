package com.weimin.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.weimin.api.IStudentService;
import com.weimin.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author weimin
 * @ClassName IndexController
 * @Description TODO
 * @date 2019/11/25 20:33
 */
@Controller
public class IndexController {

    @RequestMapping("index")
    public String index(){
        return "index";
    }

    @Reference
    private IStudentService studentService;

    @RequestMapping("show")
    public String show(Model model){
        model.addAttribute("student",studentService.selectByPrimaryKey(1L));
        return "welcome";
    }
}
