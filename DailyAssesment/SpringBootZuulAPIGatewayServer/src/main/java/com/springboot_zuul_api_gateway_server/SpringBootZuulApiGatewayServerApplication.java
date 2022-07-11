package com.springboot_zuul_api_gateway_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
//import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;

@SpringBootApplication
//@EnableDiscoveryClient
@EnableZuulServer
@RefreshScope
public class SpringBootZuulApiGatewayServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootZuulApiGatewayServerApplication.class, args);
	}

}
