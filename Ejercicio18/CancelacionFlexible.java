package ar.edu.unlp.info.oo1.ejercicio17;

import java.time.LocalDate;

public class CancelacionFlexible implements Politica{
	
	@Override
	public double calcularReembolso(DateLapse reserva, LocalDate fechaCancelacion, double precioNoche)
	{
		return reserva.getDays() * precioNoche;
	}


}
