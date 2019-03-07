package com.gblfy.springboot;

import com.gblfy.springboot.listener.SecondListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;

/**
 * SpringBoot整合Listener 方式 2
 */
@SpringBootApplication
public class SpringbootListenerApplication2 {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootListenerApplication2.class, args);
    }

    @Bean
    public ServletListenerRegistrationBean<SecondListener> getServletListenerRegistrationBean() {
        ServletListenerRegistrationBean<SecondListener> bean = new ServletListenerRegistrationBean<SecondListener>(new SecondListener());
        return bean;
    }
}
