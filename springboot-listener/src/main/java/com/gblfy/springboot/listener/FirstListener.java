package com.gblfy.springboot.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * @author gblfy
 * @ClassNme FirstListener
 * @Description SpringBoot整合Listener 方式 1
 * @Date 2019/2/20 13:52
 * @version1.0
 */
/*
<listener>
    <listener-class>com.gblfy.listener.FirstListener</listener-class>
</listener>
 */
@WebListener
public class FirstListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("FirstListener init .....");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
