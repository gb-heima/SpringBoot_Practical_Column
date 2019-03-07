package com.gblfy.springboot.controller;

import com.gblfy.springboot.pojo.Users;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gblfy
 * @ClassNme UsrController
 * @Description springboot 整合jsp
 * @Date 2019/2/21 8:36
 * @version1.0
 */
@Controller//在这里不能用@RestController,因为需要做页面跳转
public class UsrController {

    //    处理请求，产生数据
    @RequestMapping("/showUser")
    public String showUser(Model model) {
        List<Users> list = new ArrayList<>();
        list.add(new Users(1, "zhangsan", 20));
        list.add(new Users(2, "lisi", 22));
        list.add(new Users(3, "wangwu", 25));
        //需要一个Model对象
        model.addAttribute("list", list);
        //视图跳转
        return "userList";
    }


}