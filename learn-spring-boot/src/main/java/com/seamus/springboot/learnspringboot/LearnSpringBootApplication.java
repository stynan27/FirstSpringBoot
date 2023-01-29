package com.seamus.springboot.learnspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearnSpringBootApplication {

	public static void main(String[] args) {
    // Tomcat started on port 8080
		SpringApplication.run(LearnSpringBootApplication.class, args);
	}

}
