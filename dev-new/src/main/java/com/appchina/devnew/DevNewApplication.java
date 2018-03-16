package com.appchina.devnew;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.appchina.**")
@MapperScan("com.appchina.devnew.mapper")
public class DevNewApplication {
	public static void main(String[] args) {
		SpringApplication.run(DevNewApplication.class, args);
	}
}
