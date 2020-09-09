package com.mvcjdbc.ojdbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OjdbcApplication {

	public static void main(String[] args) {
		SpringApplication.run(OjdbcApplication.class, args);
		System.out.println("service is up");
	}

}
