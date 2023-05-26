package com.example.sprnm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class SprnmApplication {

	public static void main(String[] args) {
		SpringApplication.run(SprnmApplication.class, args);
	}

}
