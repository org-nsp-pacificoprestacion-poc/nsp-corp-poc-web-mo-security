package com.poc.security;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SecurityApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void testSuma() {
		int resultado = 2 + 3;
		assertEquals(5, resultado, "La suma de 2 + 3 debe ser 5");
	}
}
