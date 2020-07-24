package com.example.bookservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableDiscoveryClient
public class BookServiceApplication {

	@RequestMapping("/trending")
	public String getTrending(){
		return "Cloud Native Java; Spring in Action";
	}
	public static void main(String[] args) {
		SpringApplication.run(BookServiceApplication.class, args);
	}
}
