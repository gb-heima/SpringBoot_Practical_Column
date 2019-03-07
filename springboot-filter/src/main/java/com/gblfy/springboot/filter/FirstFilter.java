package com.gblfy.springboot.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @author gblfy
 * @ClassNme FirstFilter
 * @Description springboot整合filter方式1
 * @Date 2019/2/20 13:41
 * @version1.0
 */
/*
以前filter
<filter>
    <filter-name>FirstFilter</filter-name>
    <filter-class>com.gblfy.controller.FirstFilter</filter-class>
</filter>
<filter-mapping>
    <filter-name>FirstFilter</filter-name>
    <filter-patten>/first</filter-patten>
</filter-mapping>
 */
//urlPattern是一个数组可以添加多个
//@WebFilter(filterName = "FirstFilter",urlPatterns = {"*.do","*.jsp"})
@WebFilter(filterName = "FirstFilter", urlPatterns = {"/first"})
public class FirstFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("进入filter");
//        //放行
        chain.doFilter(request, response);
        System.out.println("离开filter");
    }

    @Override
    public void destroy() {
    }
}