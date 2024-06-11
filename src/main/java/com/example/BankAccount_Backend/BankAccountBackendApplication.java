package com.example.BankAccount_Backend;

import com.example.BankAccount_Backend.service.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BankAccountBackendApplication {

	@Autowired
	private Client client;

	public static void main(String[] args) {
		SpringApplication.run(BankAccountBackendApplication.class, args);
	}

}
