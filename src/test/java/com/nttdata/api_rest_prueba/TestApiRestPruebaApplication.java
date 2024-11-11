package com.nttdata.api_rest_prueba;

import org.springframework.boot.SpringApplication;

public class TestApiRestPruebaApplication {

	public static void main(String[] args) {
		SpringApplication.from(ApiRestPruebaApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
