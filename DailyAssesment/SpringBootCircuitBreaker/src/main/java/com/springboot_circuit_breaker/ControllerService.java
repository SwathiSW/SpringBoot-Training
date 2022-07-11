package com.springboot_circuit_breaker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.circuitbreaker.CircuitBreakerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ControllerService {

	@Autowired
	private RestTemplate rest;
	@Autowired
	private CircuitBreakerFactory cbFactory;

	public ControllerService(RestTemplate rest, CircuitBreakerFactory cbFactory) {
		this.rest = rest;
		this.cbFactory = cbFactory;
	}

	public String slow() {
		return cbFactory.create("slow").run(() -> rest.getForObject("/slow", String.class), throwable -> "fallback");
	}
}
