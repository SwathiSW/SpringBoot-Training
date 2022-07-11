package com.springboot_hybernet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class SpringBootHybernetApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootHybernetApplication.class, args);
	}

}
