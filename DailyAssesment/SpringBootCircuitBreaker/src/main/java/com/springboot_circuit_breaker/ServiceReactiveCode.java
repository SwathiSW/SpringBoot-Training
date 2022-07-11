package com.springboot_circuit_breaker;

import org.springframework.cloud.client.circuitbreaker.ReactiveCircuitBreakerFactory;
import org.springframework.stereotype.Service;

@Service
public class ServiceReactiveCode {

	private ReactiveCircuitBreakerFactory cbFactory;
	private WebClient webClient;

	public ServiceReactiveCode(WebClient webClient, ReactiveCircuitBreakerFactory cbFactory) {
		this.webClient = webClient;
		this.cbFactory = cbFactory;
	}

	public Mono<String> slow() {
        return webClient.get().uri("/slow").retrieve().bodyToMono(String.class).transform(it -> cbFactory.create("slow").run(it, throwable -> return Mono.just("fallback")));
    }
}
