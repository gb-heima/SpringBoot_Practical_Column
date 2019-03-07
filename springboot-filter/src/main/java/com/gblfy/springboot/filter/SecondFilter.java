package com.gblfy.springboot.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author gblfy
 * @ClassNme SecondFilter
 * @Description springboot整合filter方式2
 * @Date 2019/2/20 13:44
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
public class SecondFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("进入SecondFilter");
//        //放行
        chain.doFilter(request, response);
        System.out.println("离开SecondFilter");
    }

    @Override
    public void destroy() {
    }
}
