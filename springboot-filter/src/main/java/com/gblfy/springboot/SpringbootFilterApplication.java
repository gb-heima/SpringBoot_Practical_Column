package com.gblfy.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;


/**
 * @author gblfy
 * @ClassNme AppFilter
 * @Description springboot整合filter方式1
 * @Date 2019/2/20 13:39
 * @version1.0
 */
@SpringBootApplication
@ServletComponentScan//在springboot启动时会扫描@Webfilter注解和@webFilter注解，并将该类实例化
public class SpringbootFilterApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootFilterApplication.class, args);
    }

}
