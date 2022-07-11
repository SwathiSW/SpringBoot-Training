//package com.springboot_kafka_demo;
//
//import java.util.HashMap;
//import java.util.Map;
//
//import org.apache.kafka.clients.admin.AdminClientConfig;
//import org.apache.kafka.clients.admin.NewTopic;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.kafka.core.KafkaAdmin;
////import org.springframework.kafka.core.KafkaAdmin;
//
//@Configuration
//public class KafkaTopicConfig {
//	@Value(value = "${kafka.bootstrapAddress}")
//	private String kafkaAddress;
//
//	@Bean
//    public KafkaAdmin kafkaAdmin1() {
//	public Map<String, Object> kafkaAdmin1() {
//		Map<String, Object> configs = new HashMap<>();
//		configs.put(AdminClientConfig.BOOTSTRAP_SERVERS_CONFIG, kafkaAddress);
//		return configs;
//	}
//
//	@Bean
//	public NewTopic topic() {
//		return new NewTopic("newtopic", 1, (short) 1);
//	}
//}
