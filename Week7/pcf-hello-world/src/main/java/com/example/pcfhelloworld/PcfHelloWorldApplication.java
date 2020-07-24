package com.example.pcfhelloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@SpringBootApplication
@RestController
public class PcfHelloWorldApplication {

	@GetMapping("/message")
	public String getMessage() throws UnknownHostException {
		return "Hello, World from " + InetAddress.getLocalHost().getHostName();
	}

	public static void main(String[] args) {
		SpringApplication.run(PcfHelloWorldApplication.class, args);
	}
}
