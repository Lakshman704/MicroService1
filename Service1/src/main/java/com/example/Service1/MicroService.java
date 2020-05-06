package com.example.Service1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
@RestController
@Configuration
public class MicroService {
	
	@Autowired
	RestTemplateBuilder builder;
	
	/*
	 * @Bean public RestTemplate getTemplate(RestTemplateBuilder builder) { return
	 * builder.build(); }
	 */
	
	@RequestMapping(value ="/micro",produces = "application/json")
	public Employee getData() {
		return builder.build().getForObject("http://localhost:9092/test/rest1",
				Employee.class);
	}
	

}
