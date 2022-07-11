package com.springboot_zuul_api_gateway_client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;

@SpringBootApplication
@EnableZuulProxy
@RefreshScope
//@EnableZuulServer
public class SpringBootZuulApiGatewayClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootZuulApiGatewayClientApplication.class, args);
	}

}
