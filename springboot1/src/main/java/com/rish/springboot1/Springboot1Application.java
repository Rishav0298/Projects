package com.rish.springboot1;

import com.rish.springboot1.entity.Customer;
import com.rish.springboot1.repository.CustomerRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class Springboot1Application {

	public static void main(String[] args) {
		SpringApplication.run(Springboot1Application.class, args);
	}
	
	@Bean
	public CommandLineRunner customerDemo(CustomerRepository repository) {
		
		return (args)->{
			
			repository.save(new Customer("Amit","Kumar"));
			repository.save(new Customer("Ram","Mohan"));
			repository.save(new Customer("Aradhya","G"));
			repository.save(new Customer("Aman","Gupta"));
			repository.save(new Customer("Rishav","Roy"));
			repository.save(new Customer("Sahil","Prakash"));
			
			System.out.println("Customer list -------- using findAll() -------");
			
			
			for (Customer c: repository.findAll()) {
				System.out.println(c);
			}
			
//			repository.findByLastName("Kumar").forEach(
//					c->{
//						System.out.println(c);
//					});
					
		};

//		for (Customer c: repository.findAll()) {
//			System.out.println(c);
//		}
//		
//		repository.findByLastName("Kumar").forEach(
//				c->{
//					System.out.println(c);
//				});
	}

}
