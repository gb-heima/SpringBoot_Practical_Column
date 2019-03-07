package com.gblfy.springboot;

import com.gblfy.springboot.servlet.SecondServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

/**
 * SpringBoot整合Servlet 方式2
 * 采用注册本地bean
 */
@SpringBootApplication
public class SpringbootServletApplication2 {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootServletApplication2.class, args);
    }

    @Bean
    public ServletRegistrationBean getServletRegistrationBean() {
        ServletRegistrationBean bean =
                new ServletRegistrationBean(new SecondServlet());
        bean.addUrlMappings("/second");
        return bean;
    }
}
