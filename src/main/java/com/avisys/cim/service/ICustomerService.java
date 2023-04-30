package com.avisys.cim.service;

import java.util.List;

import com.avisys.cim.Customer;

public interface ICustomerService {
	
	//task 1 : 1.Get Customer information over an REST API call
	List<Customer> getCustomers();
	
	
}
