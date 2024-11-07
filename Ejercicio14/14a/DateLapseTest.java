package ar.edu.unlp.info.oo1.ejercicio14;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DateLapseTest {
	private LocalDate from;
	private LocalDate to;
	private DateLapse datelapse;
	
	@BeforeEach
	public void setUp() {
		from = LocalDate.of(2024, 2, 1);
		to = LocalDate.of(2024, 2, 29);
		datelapse = new DateLapse(from,to);
	}
	
	@Test
	void testGetFrom() {
		assertEquals(from, datelapse.getFrom());
		
	}
	@Test
	void testGetTo() {
		assertEquals(to, datelapse.getTo());
	}
	@Test
	void testSizeInDays()
	{
		assertEquals(28, datelapse.sizeInDays());
	}
	@Test
	void testIncludesDateInside() 
	{
		LocalDate dateDentro = LocalDate.of(2024, 2, 3);
		assertTrue(datelapse.includesDate(dateDentro));
	}
	@Test
	void testIncludesDateOut()
	{
		LocalDate dateFuera = LocalDate.of(2024, 1, 2);
		assertFalse(datelapse.includesDate(dateFuera));
	}
	@Test
	void testRangosCorrectos() 
	{
		assertTrue(datelapse.includesDate(from));
		assertTrue(datelapse.includesDate(to));
	}
	
 
}
