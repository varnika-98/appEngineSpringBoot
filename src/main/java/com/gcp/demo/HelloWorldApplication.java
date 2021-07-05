package com.gcp.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class HelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
	}
	
	
	@RequestMapping("/")
	public String home() {
		return "Home";
	}
	
	@RequestMapping("/hello")
	public String hello() {
		return "hello from varnika !";
	}

}
