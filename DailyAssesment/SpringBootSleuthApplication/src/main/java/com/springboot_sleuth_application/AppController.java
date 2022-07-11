package com.springboot_sleuth_application;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

	private static final Logger LOG = Logger.getLogger(AppController.class.getName());

	@RequestMapping("/")
	public String index() {
		LOG.log(Level.INFO, "Index API is calling");
		return "Welcome Sleuth! 🎉";
	}
	
}
