package com.springboot_actuator_demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ActuatorController {

	@GetMapping("/greeting")
	public String greeting() {
		return "Welcome to MicroServices";
	}

	//@Value("${myname}") // Placeholder
	@Value("Sudeb Dolui")
	private String name;
	
	@GetMapping("/greet")
	public String greet() {
		return name + "Welcome to MicroServices";
	}
	
}
