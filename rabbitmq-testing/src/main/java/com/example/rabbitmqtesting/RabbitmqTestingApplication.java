package com.example.rabbitmqtesting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RabbitmqTestingApplication {

	public static void main(String[] args) {
		SpringApplication.run(RabbitmqTestingApplication.class, args);
		System.out.println("Working");
	}

}
