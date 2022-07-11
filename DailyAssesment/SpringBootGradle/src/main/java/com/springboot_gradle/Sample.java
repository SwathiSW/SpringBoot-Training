package com.springboot_gradle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Sample {
	@GetMapping("/")
	public String Greet() {
		return "Welcome to MicroService using Gradle";
		
	}
}
