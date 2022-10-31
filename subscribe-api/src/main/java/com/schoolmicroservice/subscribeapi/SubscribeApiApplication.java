package com.schoolmicroservice.subscribeapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SubscribeApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SubscribeApiApplication.class, args);
	}

}
