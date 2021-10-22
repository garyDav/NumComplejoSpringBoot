package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiParcialUno {

	public static void main(String[] args) {
		SpringApplication.run(ApiParcialUno.class, args);
	}

	static int factorial(int i) {
		if(i < 0) {
			throw new IllegalArgumentException("input should be greater than 0!");
		}
		if (i == 0 || i == 1) {
			return 1;
		}
		return i * factorial(i - 1);
	}

}
