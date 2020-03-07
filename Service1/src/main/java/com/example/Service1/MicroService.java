package com.example.Service1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
@RestController
@Service
public class MicroService {
	RestTemplate restTemplate = new RestTemplate();
	@RequestMapping(value ="/micro",produces = "application/json")
	public Employee getData() {
		
		return restTemplate.getForObject("http://localhost:9092/test/rest1",
				Employee.class);
	}
	

}
