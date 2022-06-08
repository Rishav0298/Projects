package com.rish.SpringBootRest.controller;

import java.util.List;

import com.rish.SpringBootRest.entity.Customer;

public interface ICustomerService {

	List<Customer> findAll();
}