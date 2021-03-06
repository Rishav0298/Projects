package com.rish.SpringBootRest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rish.SpringBootRest.entity.Customer;

@RestController
public class CustomerController {

	@Autowired(required=true)
	private ICustomerService customerService1;
	
	@GetMapping(value="/customers")
	public List<Customer> getCustomer() {
		
		List<Customer> customers = customerService1.findAll();
		return customers;
	}
}

