package com.springboot_login_module_from_database;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SpringBootLoginModuleFromDatabaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootLoginModuleFromDatabaseApplication.class, args);
	}

}
