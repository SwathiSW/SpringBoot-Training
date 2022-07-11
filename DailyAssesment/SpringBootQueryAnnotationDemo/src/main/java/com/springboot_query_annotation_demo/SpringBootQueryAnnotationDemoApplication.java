package com.springboot_query_annotation_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringBootQueryAnnotationDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootQueryAnnotationDemoApplication.class, args);
	}

}
