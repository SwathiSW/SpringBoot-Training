package com.springboot_circuit_breaker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import io.github.resilience4j.bulkhead.annotation.Bulkhead;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
import io.github.resilience4j.retry.annotation.Retry;

@SpringBootApplication
@SuppressWarnings({ "deprecation" })
@EnableCircuitBreaker
@EnableHystrix
public class SpringBootCircuitBreakerApplication {

	@Autowired
	public static void main(String[] args) {
		SpringApplication.run(SpringBootCircuitBreakerApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

	@RateLimiter(fallbackMethod = "filedMethod", name = "filedMethod")
	@Bulkhead(fallbackMethod = "filedMethod", name = "filedMethod")
	@CircuitBreaker(fallbackMethod = "filedMethod", name = "filedMethod")
	@Retry(name = "flightSearch")
	public String searchFlights(SearchRequest request) {

		return "Service is running successfully";
	}

	public String filedMethod() {
		return "Methos has been failed and we have treid to retriev";
	}

}
