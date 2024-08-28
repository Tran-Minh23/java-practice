package com.mink.minhSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class MinhSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(MinhSpringApplication.class, args);
	}
}
