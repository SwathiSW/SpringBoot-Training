package com.springboot_sleuth_application_2;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import brave.sampler.Sampler;

@RestController
public class AppController2 {

	@Autowired
	RestTemplate restTemplate;

	private static final Logger LOG = Logger.getLogger(AppController2.class.getName());
	
	@Bean
	public Sampler alwaysSampler() {
		return Sampler.ALWAYS_SAMPLE;
	}
	
	@RequestMapping("/application2")
	public String index() {
		LOG.log(Level.INFO, "Index API is calling");
		return "Welcome to server 2! 🎉";
	}

	@RequestMapping("/server1")
	public String getserver2() {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<String>(null, headers);

		return restTemplate.exchange("http://localhost:8091/application1", HttpMethod.GET, entity, String.class)
				.getBody();
	}

	@RequestMapping("/server3")
	public String getserver3() {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<String>(null, headers);

		return restTemplate.exchange("http://localhost:8093/application3", HttpMethod.GET, entity, String.class)
				.getBody();
	}

}
