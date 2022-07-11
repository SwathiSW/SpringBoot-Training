package com.springboot_rabbitmq_client;

public class SendingMessage {

//	1.Declare the queue, calling the queueDeclare() method on com.rabbitmq.client.Channel:
		String myQueue = "myFirstQueue";
//		channel.queueDeclare(myQueue, true, false, false, null);
//	2. Send the very first message to the RabbitMQ broker:
//		String message = "My message to myFirstQueue";
//		channel.basicPublish("",myQueue, null, message.getBytes());
//	3. Send the second message with different options:
//		channel.basicPublish("",myQueue,MessageProperties.PERSISTENT_TEXT_PLAIN,message.getBytes());

}

