package com.springboot_load_balancer_client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@SpringBootApplication
@RefreshScope
public class SpringBootLoadBalancerClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootLoadBalancerClientApplication.class, args);
	}

}
