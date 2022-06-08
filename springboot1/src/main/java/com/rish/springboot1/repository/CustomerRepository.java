package com.rish.springboot1.repository;

import java.util.List;
import java.util.Optional;

import com.rish.springboot1.entity.Customer;

import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
	
	List<Customer> findByLastName(String LastName);
	
	Optional<Customer> findById(Long id);

}
