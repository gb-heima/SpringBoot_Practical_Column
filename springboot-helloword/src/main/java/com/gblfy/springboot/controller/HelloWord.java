package com.gblfy.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gblfy
 * @ClassNme Springboot快速入门 HelloWord
 * @Description TODO
 * @Date 2019/3/7 13:27
 * @version1.0
 */
@RestController
public class HelloWord {

    @RequestMapping("/helloword")
    public String helloword() {
        return "HelloWord";
    }
//    访问链接：localhost:8080/helloword
}
