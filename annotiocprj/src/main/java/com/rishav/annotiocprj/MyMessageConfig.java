package com.rishav.annotiocprj;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyMessageConfig {
	
	@Bean 
	public MyMessage createBean() {
		return new MyMessage();
	}
	
	@Bean 
	public AnotherBean createAnotherBean() {
		return new AnotherBean();
	}

}
