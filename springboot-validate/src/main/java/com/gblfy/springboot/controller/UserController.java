package com.gblfy.springboot.controller;

import com.gblfy.springboot.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

/**
 * @program: springboot_workspace
 * @description: 这里用一句话描述这个类的作用
 * @author: gblfy
 * @create: 2019-02-23 21:41
 */
@Controller
public class UserController {

    @RequestMapping("/addUser")
    public String showPage(User user) {
        return "add";
    }
//
//    @RequestMapping("/addUser")
//    public String showPage(@ModelAttribute("aa") User user) {
//        return "add";
//    }

    /**
     * 添加用户页面
     *
     * @param user
     * @param result
     * @return
     * @Valid 开启对User对象的数据校验
     * BindingResult：封装了校验的结果
     */
    @RequestMapping("/save")
    public String saveUser(@Valid User user, BindingResult result) {
        if (result.hasErrors()) {
            return "add";
        }
        System.out.println(user);
        return "ok";
    }
//    @RequestMapping("/save")
//    public String saveUser(@ModelAttribute("aa") @Valid User user, BindingResult result) {
//        if (result.hasErrors()) {
//            return "add";
//        }
//        System.out.println(user);
//        return "ok";
//    }
}

