package com.springboot_zipkin_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import zipkin2.server.internal.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
public class SpringBootZipkinServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootZipkinServerApplication.class, args);
	}

}
