package com.rish.SpringBootRest.controller;

import java.util.ArrayList;
import java.util.List;

import com.rish.SpringBootRest.entity.Customer;

import org.springframework.stereotype.Service;

@Service
public class CustomerService implements ICustomerService{

	@Override
	public List<Customer> findAll() {
		
		ArrayList<Customer> customers = new ArrayList<Customer>();
		
		customers.add(new Customer(100L,"Rakesh","Kumar"));
		customers.add(new Customer(101L,"Abhishek","Kumar"));
		customers.add(new Customer(102L,"Chetan","Goyal"));
		customers.add(new Customer(103L,"Mohit","Gupta"));
		customers.add(new Customer(104L,"Tina","Raj"));
		customers.add(new Customer(105L,"Sanjay","Agarwal"));
		
		
		return customers;
	}

}

