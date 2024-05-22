package com.mink.minhSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

import graphql.schema.GraphQLScalarType;

@SpringBootApplication
@EnableScheduling
public class MinhSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(MinhSpringApplication.class, args);
	}

	@Bean
	public GraphQLScalarType extendedScalarLong() {
		return graphql.scalars.ExtendedScalars.GraphQLLong;
	}
}
