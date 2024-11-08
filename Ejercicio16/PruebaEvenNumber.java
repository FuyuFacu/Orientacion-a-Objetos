package ar.edu.unlp.info.oo1.ejercicio16;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PruebaEvenNumber {
	Set<Integer> parNumeros;
	
	@BeforeEach
	void setUp()
	{
		parNumeros = new EvenSetNumber();
	}
	
	@Test
	void testLongitud() {
		parNumeros.add(5);
		parNumeros.add(6);
		parNumeros.add(8);
		parNumeros.add(8);
		parNumeros.add(10);
		assertEquals(3, parNumeros.size());
	}

}
