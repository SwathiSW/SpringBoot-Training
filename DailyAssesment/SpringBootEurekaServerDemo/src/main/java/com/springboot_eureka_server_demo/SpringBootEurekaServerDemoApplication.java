package com.springboot_eureka_server_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
@EnableDiscoveryClient
public class SpringBootEurekaServerDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEurekaServerDemoApplication.class, args);
	}

}
