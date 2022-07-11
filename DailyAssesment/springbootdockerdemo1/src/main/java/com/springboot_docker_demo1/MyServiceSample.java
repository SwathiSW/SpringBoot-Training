package com.springboot_docker_demo1;

import org.springframework.retry.annotation.Recover;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;

@Service
public class MyServiceSample {

	@Retryable(value = Exception.class, maxAttempts = 2)
	public String serviceInvoked() {
		String msg;
		try {
			msg = "Demo Service";
			new Exception();
		} catch (Exception e) {
			msg = "Error Occured in Demo Service";
		}
		return msg;
	}

	@Recover
	public String serviceRecovered() {
		return "This is Sample Service Recovered";
	}

}
