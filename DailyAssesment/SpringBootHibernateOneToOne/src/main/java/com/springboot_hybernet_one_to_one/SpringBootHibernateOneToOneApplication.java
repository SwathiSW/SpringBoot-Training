package com.springboot_hybernet_one_to_one;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
public class SpringBootHibernateOneToOneApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootHibernateOneToOneApplication.class, args);
	}

}
