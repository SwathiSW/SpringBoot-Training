package com.springboot_zuul_api_gateway_client;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

	@GetMapping("/test")
	public String testClient() {
		return "Client is Running";
	}
}
