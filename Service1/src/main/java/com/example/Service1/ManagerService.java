package com.example.Service1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ManagerService {
	@Autowired
	Manager manager;
	@RequestMapping(value = "/manager",produces = "application/json")
	
	public Manager getData() {
		manager.setManageId(20);
		manager.setName("Srinivas");
		return manager;
		
	}
	
	
	

}
