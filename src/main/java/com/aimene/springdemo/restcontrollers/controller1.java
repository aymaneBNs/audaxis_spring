package com.aimene.springdemo.restcontrollers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller1 {
	
	
	
	
	@GetMapping(path="/service1",produces = {"application/json"})
	public String  getInfoInscrit() {
	
		
		
		// helllo
		
		return  "hello you called me  aimene ";
		
		
	}
	
	
	
	

}
