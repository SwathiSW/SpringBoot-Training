package com.springboot_zuul_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient

public class SpringBootZuulDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootZuulDemoApplication.class, args);
	}

}
