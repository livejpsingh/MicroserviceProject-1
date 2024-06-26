package com.programmerpoints.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ApiGatewayApplication {
// main class
	public static void main(String[] args) {
		
		SpringApplication.run(ApiGatewayApplication.class, args);
	}

}
