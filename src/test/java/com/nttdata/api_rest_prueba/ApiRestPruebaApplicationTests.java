package com.nttdata.api_rest_prueba;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class ApiRestPruebaApplicationTests {

	@Test
	void contextLoads() {
	}

}
