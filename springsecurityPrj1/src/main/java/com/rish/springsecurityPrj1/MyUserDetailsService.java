package com.rish.springsecurityPrj1;

import java.util.Arrays;
import java.util.List;

import org.apache.tomcat.jni.User;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService throws UsernameNotFoundException {

	@Override
	public UserDetails loadUserByUsername(String username)  {
		
		List<SimpleGrantedAuthority> roles=null;
		
		if(username.equals("admin")) {
			
			roles=Arrays.asList(new SimpleGrantedAuthority("ROLE_ADMIN"));
			
			return new User("admin", "$2a$10$csMB4bo.EE7HDyRTTibTnu28tCffZ4ZwYNXRk50D6/astQQt32dTC", roles);
		}
		else {
			if(username.equals("user")) {
				roles=Arrays.asList(new SimpleGrantedAuthority("ROLE_USER"));
				
				return new User("user", "$2a$10$JkyMeUeRJ9pPAttOwDxFHeJyjR5/Vt01qJVd5xIcAtjVhaGQZCezi", roles);
			}
		}
		
		throw new  UsernameNotFoundException("Username not found");
		
	}

}
