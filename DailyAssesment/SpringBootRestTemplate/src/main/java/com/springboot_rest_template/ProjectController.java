package com.springboot_rest_template;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ProjectController {

	@Autowired
	RestTemplate restTemplate;

	@RequestMapping(value = "/resttemplate/employee")
	public String getOrderList() {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<String>(null, headers);

		return restTemplate.exchange("http://localhost:8086/api/list", HttpMethod.GET, entity, String.class).getBody();
	}

}
