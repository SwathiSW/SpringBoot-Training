package com.springboot_thymleaf;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Sample2 {
	@GetMapping("/Greet")
	public String Greet() {
		return "Message";
	}

}
