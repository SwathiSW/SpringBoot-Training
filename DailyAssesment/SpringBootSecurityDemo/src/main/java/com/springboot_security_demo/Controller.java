package com.springboot_security_demo;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("/")
	public String greeting( Authentication authentication) {
		
		String userName = authentication.getName();
		
		return "Spring Security In-Memory Authentication "+userName;
	
	}
	
}
