package com.gblfy.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * 采用注解扫描
 */
@SpringBootApplication
@ServletComponentScan//在springboot启动时会扫描@WebServlet注解，并将该类实例化
public class SpringbootServletApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootServletApplication.class, args);
    }

}
