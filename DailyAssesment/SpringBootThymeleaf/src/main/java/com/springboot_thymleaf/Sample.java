package com.springboot_thymleaf;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Sample {
@GetMapping("/")
public String Greet1() {
	return "Welcome Thymeleaf";
}
}
