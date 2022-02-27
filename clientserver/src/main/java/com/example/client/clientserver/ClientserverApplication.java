package com.example.client.clientserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ClientserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientserverApplication.class, args);
	}

}
