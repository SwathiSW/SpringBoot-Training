package com.springboot_eureka_book_consumer;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class SpringBootBookConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBookConsumerApplication.class, args);
	}

}
