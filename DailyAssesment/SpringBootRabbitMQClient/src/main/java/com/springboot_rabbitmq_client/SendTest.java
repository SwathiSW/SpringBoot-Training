package com.springboot_rabbitmq_client;

import java.nio.charset.StandardCharsets;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

public class SendTest {

//	1.) Setup class and name queue.
	public final static String Queue_Name = "Hello";

	public static void main(String[] argv) throws Exception {
//		2.) Create Connection to server.
		ConnectionFactory factory = new ConnectionFactory();
		factory.setHost("localhost");
		try (Connection connection = factory.newConnection(); Channel channel = connection.createChannel()) {
			channel.queueDeclare(Queue_Name, false, false, false, null);
			String message = "Hello World!";
			channel.basicPublish("", Queue_Name, null, message.getBytes(StandardCharsets.UTF_8));
			System.out.println(" [x] Sent '" + message + "'");
		}
	}

}
