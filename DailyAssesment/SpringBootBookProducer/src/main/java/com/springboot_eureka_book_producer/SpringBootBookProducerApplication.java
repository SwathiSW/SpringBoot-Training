package com.springboot_eureka_book_producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringBootBookProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBookProducerApplication.class, args);
	}

}
