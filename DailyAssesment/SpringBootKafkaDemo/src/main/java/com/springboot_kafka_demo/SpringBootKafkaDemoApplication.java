package com.springboot_kafka_demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public abstract class SpringBootKafkaDemoApplication implements ApplicationRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootKafkaDemoApplication.class, args);
	}

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;

	public void sendMessage(String msg) {
		kafkaTemplate.send("Kafka-topic", msg);
	}

	@KafkaListener(topics = "kafka-topic", groupId = "group-id")
	public void listen(String message) {
		System.out.println("Received Messasge in group - group-id: " + message);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		sendMessage("Hi Welcome to Spring let's learn Apache Kafka");
	}
}
