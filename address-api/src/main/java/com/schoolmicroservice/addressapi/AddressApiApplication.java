package com.schoolmicroservice.addressapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AddressApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(AddressApiApplication.class, args);
	}

}
