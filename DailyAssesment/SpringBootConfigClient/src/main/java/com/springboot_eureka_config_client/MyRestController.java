package com.springboot_eureka_config_client;

//import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class MyRestController {

//	@Value("${name}")
//	private String name;

	@GetMapping("/")
	public String greeting() {
		String name = "Someone";
		return " Good Morning" + name;
	}
}
