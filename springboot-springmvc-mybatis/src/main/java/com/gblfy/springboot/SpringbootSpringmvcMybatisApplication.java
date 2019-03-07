package com.gblfy.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * springboot启动类
 */
@SpringBootApplication
@MapperScan(basePackages ="com.gblfy.repository")
public class SpringbootSpringmvcMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootSpringmvcMybatisApplication.class, args);
    }

}
