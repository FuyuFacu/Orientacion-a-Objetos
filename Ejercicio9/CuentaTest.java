package ar.edu.unlp.info.oo1.ejercicio9;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CuentaTest {
	private CuentaCorriente Corriente;
	private CajaDeAhorro Ahorro;

	@BeforeEach
	void setUp() {
		Ahorro = new CajaDeAhorro();
		Corriente = new CuentaCorriente();
		Ahorro.depositar(1000);
		Corriente.depositar(2000);
		
		
		
		
	}
	
	@Test
	void TestGetSaldo() {
		assertEquals(2000,Corriente.getSaldo());
		assertEquals(980,Ahorro.getSaldo());
	}

	@Test
	void TestTransferirACuenta() {
	    // Transferir de Ahorro a Corriente
	    Ahorro.transferirACuenta(200, Corriente);
	    assertEquals(2200, Corriente.getSaldo()); // Saldo de CuentaCorriente después de la transferencia
	    assertEquals(776, Ahorro.getSaldo());     // Saldo de CajaDeAhorro después de la transferencia

	    // Transferir de Corriente a Ahorro
	    Corriente.transferirACuenta(300, Ahorro);
	    assertEquals(1900, Corriente.getSaldo()); // Saldo de CuentaCorriente después de la transferencia
	    assertEquals(1076, Ahorro.getSaldo());    // Saldo de CajaDeAhorro debe ser 1076 ME TIRA 1070 ECLIPSE DE MRDA
	}

	
}
