package com.avisys.cim.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avisys.cim.Customer;
import com.avisys.cim.dao.ICustomerDao;

import jakarta.transaction.Transactional;


@Service
@Transactional
public class CustomerServiceImpl implements ICustomerService {
	
	@Autowired
	private ICustomerDao customerDao;

	//task 1 : 1.Get Customer information over an REST API call
	@Override
	public List<Customer> getCustomers() {
		
		return customerDao.findAll();
	}

}
