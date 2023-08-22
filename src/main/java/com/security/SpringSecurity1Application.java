package com.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringSecurity1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurity1Application.class, args);
	}
	
	@GetMapping("/message/{name}")
	public String getMessage(@PathVariable String name)
	{
		return "Hello mr. "+name;
	}

}
