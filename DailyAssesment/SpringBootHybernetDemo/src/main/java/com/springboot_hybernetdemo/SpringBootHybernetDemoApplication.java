package com.springboot_hybernetdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SpringBootHybernetDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootHybernetDemoApplication.class, args);
	}

}
