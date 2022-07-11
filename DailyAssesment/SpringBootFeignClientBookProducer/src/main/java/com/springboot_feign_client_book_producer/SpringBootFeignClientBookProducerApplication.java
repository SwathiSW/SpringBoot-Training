package com.springboot_feign_client_book_producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringBootFeignClientBookProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootFeignClientBookProducerApplication.class, args);
	}

}
