package com.synergyvault.studentRegistrationAPI.server.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.synergyvault"})
public class StudentRegistrationApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentRegistrationApiApplication.class, args);
	}

}
