package com.springboot_kafka_tutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class SpringBootKafkaTutorialApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootKafkaTutorialApplication.class, args);
	}

}
