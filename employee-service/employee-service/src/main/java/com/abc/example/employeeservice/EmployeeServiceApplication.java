package com.abc.example.employeeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;


@SpringBootApplication
@EnableFeignClients 
@EnableEurekaClient

public class EmployeeServiceApplication {
//	
//	@Bean
//	public RestTemplate restTemplete() {
//		return new RestTemplate();
//		
//	}
	
//	@Bean
//	public WebClient webClient()
//	{
//		return WebClient.builder().build();
//		
//	}

	public static void main(String[] args) {
		SpringApplication.run(EmployeeServiceApplication.class, args);
	}

}
