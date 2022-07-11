package com.springboot_eureka_config_client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@SpringBootApplication
@RefreshScope
public class SpringBootBookConfigClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBookConfigClientApplication.class, args);
	}

}
