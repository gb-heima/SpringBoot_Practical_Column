package com.gblfy.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * SpringBoot整合Listener 方式 1
 */
@SpringBootApplication
@ServletComponentScan
public class SpringbootListenerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootListenerApplication.class, args);
	}

}
