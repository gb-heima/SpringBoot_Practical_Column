package com.gblfy.springboot.controller;

import com.gblfy.springboot.entity.User;
import com.gblfy.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author gblfy
 * @ClassNme UsersController
 * @Description 用户在页面上，添加数据，后台保存，视图技术采用thymeleaf
 * @Date 2019/2/22 18:35
 * @version1.0
 */
@Controller//页面跳转不用@ResponseBody 只处理返回数据json
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 跳转页面
     *
     * @param page
     * @return
     */
    @RequestMapping("/{page}")
    public String showPage(@PathVariable String page) {
        return page;
    }

    /**
     * 添加用户
     *
     * @param user
     * @return
     */
    @RequestMapping("/addUser")
    public String save(User user) {
        userService.insert(user);
        return "ok";
    }

    /**
     * 查询全部用户
     *
     * @param model
     * @return
     */
    @RequestMapping("/findUserAll")
    public String findUserAll(Model model) {
        List<User> list = userService.selectAll();
        model.addAttribute("list", list);
        return "showUser";
    }

    /**
     * 通过id查询用户
     *
     * @param id
     * @return
     */
    @RequestMapping("/findUserById")
    public String findUserById(Integer id, Model model) {
        User user = userService.selectByPrimaryKey(id);
        model.addAttribute("user", user);
        return "updateUser";
    }

    /**
     * 编辑用户信息
     *
     * @param user
     * @return
     */
    @RequestMapping("/editUser")
    public String findUserById(User user) {
        userService.updateByPrimaryKey(user);
        return "ok";
    }

    /**
     * 删除用户
     *
     * @param id
     * @return
     */
    @RequestMapping("/delUser")
    public String findUserById(Integer id) {
        userService.deleteByPrimaryKey(id);
        return "redirect:/user/findUserAll";
    }

}
