package com.rish.springsecurityPrj1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MyController {
	
	@GetMapping("/hello")
	public String myhelloPage() {
		return "Hello Evryone";
	}
	
	@GetMapping("/user")
	public String myUserPage() {
		System.out.println("inside user method");
		return "<h2>Hello User</h2>";
	}
	
	@GetMapping("/admin")
	public String myAdminPage() {
		System.out.println("inside admin method");
		return "<h2>Hello Admin</h2>";
	}

}
