package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    @RequestMapping("/")
    public String index(){
        System.out.println("hello");
        System.out.println("third commit");
        System.out.println("hot-fix four commit");
        System.out.println("master chongtu commit");
        System.out.println("hot-fix chongtu commit");
        System.out.println("push github commit");
        return "index";
    }

}
