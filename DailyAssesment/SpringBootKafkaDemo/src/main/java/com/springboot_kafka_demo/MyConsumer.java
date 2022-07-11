package com.springboot_kafka_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyConsumer {

    @GetMapping("/consumer")
    //@KafkaListener(topics = "mytopic", groupId = "mygroup")
    // employee.salary.hra
    public void consumerFromTopic(@RequestParam String msg) {
        System.out.println(msg);
    }
}
