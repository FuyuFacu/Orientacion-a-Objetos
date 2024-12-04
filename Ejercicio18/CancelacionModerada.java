package ar.edu.unlp.info.oo1.ejercicio17;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class CancelacionModerada implements Politica{

	public double calcularReembolso(DateLapse reserva, LocalDate fechaCancelacion, double precioNoche)
	{
		long cantDias = ChronoUnit.DAYS.between(fechaCancelacion, reserva.getFrom());
		if (cantDias < 7)
		{
			return reserva.getDays() * precioNoche;
		} else if (cantDias <= 2) 
		{
			return (reserva.getDays() * precioNoche) * 0.5;
		}
		return 0;
	}
	
	
}
