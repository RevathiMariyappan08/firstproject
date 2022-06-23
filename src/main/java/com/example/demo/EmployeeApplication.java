package com.example.demo;


import org.apache.log4j.Logger;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;



@SpringBootApplication
public class EmployeeApplication {
	static final Logger log=Logger.getLogger(EmployeeApplication.class.getName());
	public static void main(String[] args) {
		SpringApplication.run(EmployeeApplication.class, args);
	}
	@Bean
	 public RestTemplate getRestTemplate() {
	      return new RestTemplate();
	
	}
}


