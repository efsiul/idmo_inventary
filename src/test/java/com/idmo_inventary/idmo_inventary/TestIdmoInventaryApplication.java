package com.idmo_inventary.idmo_inventary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestIdmoInventaryApplication {

	public static void main(String[] args) {
		SpringApplication.from(IdmoInventaryApplication::main).with(TestIdmoInventaryApplication.class).run(args);
	}

}
