package com.mink.minhSpring;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mink.minhSpring.restservice.GreetingController;

@SpringBootTest
class MinhSpringApplicationTests {

	@Autowired
	private GreetingController controller;

	@Test
	void contextLoads() {
		assertThat(controller).isNotNull();
	}

}
