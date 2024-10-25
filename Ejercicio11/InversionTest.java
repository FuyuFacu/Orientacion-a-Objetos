package ar.edu.unlp.info.oo1.ejercicio11;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class InversionTest {
	PlazoFijo Microsoft;
	InversionTipo Amazon;
	PlazoFijo Google;
	InversionTipo Samsung;
	Inversor Pedro;
	

    @BeforeEach
	void setUp() throws Exception {
    	Pedro = new Inversor("Pedrito");
		LocalDate Fecha = LocalDate.of(2022, 10, 14);
		Microsoft = new PlazoFijo(Fecha,5000,10);
		Amazon = new InversionEnAcciones("Prueba",5,80);
		Google = new PlazoFijo(Fecha,5000,10);
		Samsung = new InversionEnAcciones("OtraPrueba",20,180);
		Pedro.agregarInversion(Microsoft);
		Pedro.agregarInversion(Amazon);
		Pedro.agregarInversion(Google);
		Pedro.agregarInversion(Samsung);
		
	}
	
	
	
	@Test
	public void valoresActuales() {
		assertTrue(Microsoft.valorActual() > 5000);
		assertTrue(Google.valorActual() > 5000);
		assertEquals(400,Amazon.valorActual());
		assertEquals(3600,Samsung.valorActual());
		assertEquals(4,Pedro.getInversiones().size());
	}
	
	@Test
	public void testValorTotalInversor() {
	    double valorTotalEsperado = Microsoft.valorActual() + Amazon.valorActual() + Google.valorActual() + Samsung.valorActual();
	    assertEquals(valorTotalEsperado, Pedro.InversionTotal()); 
	}

	
	
	@Test
	public void getFechas() {
		assertEquals(LocalDate.of(2022, 10, 14), Microsoft.getFecha());
		assertEquals(LocalDate.of(2022, 10, 14), Google.getFecha());
	}
	

}
