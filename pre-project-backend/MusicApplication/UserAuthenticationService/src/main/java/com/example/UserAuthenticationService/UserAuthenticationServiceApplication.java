package com.example.UserAuthenticationService;

import com.example.challenge.Filter.JwtFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class UserAuthenticationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserAuthenticationServiceApplication.class, args);
	}


}
