package com.gblfy.springboot.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author gblfy
 * @ClassNme FirstServlet
 * @Description SpringBoot整合Servlet 方式1
 * @Date 2019/3/7 13:32
 * @version1.0
 */
/*
以前ssm中的web.xml配置文件中的servlet

<servlet>
  <servlet-name>FirstServlet</servlet-name>
  <servlet-class>com.gblfy.servlet.FirstServlet</servlet-class>
</servlet>

<servlet-mapping>
    <servlet-name>FirstServlet</servlet-name>
    <url-patten>/first</url-patten>
</servlet-mapping>
 */
@WebServlet(name = "FirstServlet", urlPatterns = "/first")
public class FirstServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("FirstServlet启动........");
    }
}
