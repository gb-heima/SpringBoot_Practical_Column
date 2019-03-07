package com.gblfy.springbootexception.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: springboot_workspace
 * @description: 这里用一句话描述这个类的作用
 * @author: gblfy
 * @create: 2019-02-24 09:23
 */
@Controller
public class UserController {

    @RequestMapping("/showUser")
    public String showInfo() {
       String str = null;
       str.length();
        return "index";
    }
    @RequestMapping("/showUser2")
    public String showInfo2() {
        int a = 10 / 0;
        return "index";
    }

}
