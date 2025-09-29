package pkg;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testSuma() {
		int valorEsperado = 7;
		int valorReal = Calculadora.suma(4, 3);
		
		assertEquals(valorEsperado, valorReal);
	}

	@Test
	void testResta() {
		int valorEsperado = 1;
		int valorReal = Calculadora.resta(4, 3);
		
		assertEquals(valorEsperado, valorReal);
	}

	@Test
	void testMultiplica() {
		int valorEsperado = 12;
		int valorReal = Calculadora.multiplica(4, 3);
		
		assertEquals(valorEsperado, valorReal);
	}

	@Test
	void testDivide() {
		int valorEsperado = 1;
		int valorReal = Calculadora.divide(4, 3);
		
		assertEquals(valorEsperado, valorReal);
	}
	@Test
	void testDividePor0() {
		int valorEsperado = -1;
		int valorReal = Calculadora.divide(4, 0);
		
		assertEquals(valorEsperado, valorReal);
	}

}
