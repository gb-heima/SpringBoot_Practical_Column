package com.gblfy.springboot.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author gblfy
 * @ClassNme FirstServlet
 * @Description SpringBoot整合Servlet 方式2
 * @Date 2019/2/19 14:49
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
public class SecondServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("SecondServlet启动........");
    }
}


