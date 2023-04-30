package com.avisys.cim.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.avisys.cim.service.ICustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	ICustomerService customerService;
	
	//task 1 : 1.Get Customer information over an REST API call

	@GetMapping("/getCustomers")
	public ResponseEntity<?> getCustomers(){

			return new ResponseEntity<>(customerService.getCustomers() ,HttpStatus.OK);
		
		
	}
}
