package com.springboot_rest_template_employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class SpringBootRestTemplateEmployeeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestTemplateEmployeeApplication.class, args);
	}

}
