package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
class ApiParcialUnoTests {

	@Test
	void factorialTest() {
		assertEquals(1, ApiParcialUno.factorial(0));
		assertEquals(1, ApiParcialUno.factorial(1));
	}

	@Test
	void factorialIllegalArgumentTest() {
		assertThrows(IllegalArgumentException.class, () -> ApiParcialUno.factorial(-1));
	}

}
