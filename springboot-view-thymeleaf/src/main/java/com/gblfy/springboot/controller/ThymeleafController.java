package com.gblfy.springboot.controller;

import com.gblfy.springboot.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

/**
 * @author gblfy
 * @ClassNme ThymeleafController
 * @Description thymeleaf入门案例
 * @Date 2019/2/22 13:37
 * @version1.0
 */
@Controller
public class ThymeleafController {

    @RequestMapping("/show")
    public String showInfo(Model model) {
        model.addAttribute("msg", "Thymeleaf 第一个案例");
        model.addAttribute("key", new Date());
        return "index";
    }

    @RequestMapping("/show2")
    public String showInfo2(Model model) {
        model.addAttribute("sex", "男");
        model.addAttribute("id", "2");
        return "index2";
    }

    @RequestMapping("/show3")
    public String showInfo3(Model model) {
        List<User> list = new ArrayList<>();
        list.add(new User(1, "zhangsan", 20));
        list.add(new User(2, "lisi", 21));
        list.add(new User(3, "wangwu", 22));
        model.addAttribute("list", list);
        return "index3";
    }

    @RequestMapping("/show4")
    public String showInfo4(Model model) {
        Map<String, Object> map = new HashMap<>();
        map.put("u1", new User(1, "zhangsan", 20));
        map.put("u2", new User(2, "lisi", 21));
        map.put("u3", new User(3, "wangwu", 22));
        model.addAttribute("map", map);
        return "index4";
    }

    @RequestMapping("/show5")
    public String showInfo5(HttpServletRequest request, Model model) {
        request.setAttribute("req", "HttpServletRequest");
        request.getSession().setAttribute("sess", "HttpSession");
        request.getSession().getServletContext().setAttribute("app", "application");
        return "index5";
    }
}