package com.springboot_rabbitmq_demo;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile({ "trail", "hello-world" })
@Configuration
public class TrailConfig {

	@Bean
	public Queue hello() {
		return new Queue("hello");
	}

	@Profile("sender")
	@Bean
	public TrailSender sender() {
		return new TrailSender();
	}

	@Profile("receiver")
	@Bean
	public TrailReceiver receiver() {
		return new TrailReceiver();
	}

}
