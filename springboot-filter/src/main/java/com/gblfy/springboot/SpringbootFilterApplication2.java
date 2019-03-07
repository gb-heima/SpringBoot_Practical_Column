package com.gblfy.springboot;

import com.gblfy.springboot.filter.SecondFilter;
import com.gblfy.springboot.servlet.SecondServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;


/**
 * @author gblfy
 * @ClassNme AppFilter2
 * @Description springboot整合filter方式2
 * @Date 2019/2/20 13:45
 * @version1.0
 */
@SpringBootApplication
public class SpringbootFilterApplication2 {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootFilterApplication2.class, args);
    }

    //    注册servlet
    @Bean
    public ServletRegistrationBean getServletRegistrationBean() {
        ServletRegistrationBean bean = new ServletRegistrationBean(new SecondServlet());
        bean.addUrlMappings("/second");
        return bean;
    }

    //    注册filter
    @Bean
    public FilterRegistrationBean getFilterRegistrationBean() {
        FilterRegistrationBean bean = new FilterRegistrationBean(new SecondFilter());
//        bean.addUrlPatterns(new String[]{"*.do","*.jsp"});
        bean.addUrlPatterns("/second");
        return bean;
    }
}
