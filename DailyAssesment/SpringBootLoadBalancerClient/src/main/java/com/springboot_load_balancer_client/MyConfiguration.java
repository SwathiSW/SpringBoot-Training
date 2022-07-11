package com.springboot_load_balancer_client;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {

	@Bean
	@LoadBalanced
	public WebClient.Builder loadBalancedWebClientBuilder() {
		return WebClient.builder();
	}
}

public class MyClass {
	@Autowired
	private WebClient.Builder webClientBuilder;

	public Mono<String> doOtherStuff() {
		return webClientBuilder.build().get().uri("http://stores/stores").retrieve().bodyToMono(String.class);
	}
}
