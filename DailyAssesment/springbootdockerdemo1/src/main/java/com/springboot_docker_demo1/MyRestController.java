package com.springboot_docker_demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {
	@Autowired
	private MyServiceSample myServiceSample;

	@GetMapping("/retry")
	@ExceptionHandler({ Exception.class })
	public String validateSPringRetryCapability() {

		System.out.println("Inside RestController mathod..");

		return myServiceSample.serviceInvoked();
	}
}