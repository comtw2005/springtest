package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.example.dao","com.example.controller","com.example.model","com.example.service"})
//@EntityScan({"com.example.demo","com.example.model","com.example.controller","com.example.service","com.example.repository"})
public class SpringMVCApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(SpringMVCApplication.class, args);
	}

}
