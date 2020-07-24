package com.example.bookstorediscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class BookstoreDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreDiscoveryApplication.class, args);
	}
}
