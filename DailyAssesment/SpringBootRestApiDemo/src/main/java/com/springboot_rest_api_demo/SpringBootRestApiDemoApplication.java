package com.springboot_rest_api_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class SpringBootRestApiDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestApiDemoApplication.class, args);
	}

}
