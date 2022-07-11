package com.springboot_eureka_client_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringBootEurekaClientDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEurekaClientDemoApplication.class, args);
	}

}
