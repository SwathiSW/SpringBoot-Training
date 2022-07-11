package com.springboot_docker_demo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.retry.annotation.EnableRetry;

@EnableRetry
@SpringBootApplication
public class Springbootdockerdemo1Application {

	public static void main(String[] args) {
		SpringApplication.run(Springbootdockerdemo1Application.class, args);
	}

}
