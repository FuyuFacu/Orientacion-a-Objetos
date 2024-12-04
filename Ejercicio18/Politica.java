package ar.edu.unlp.info.oo1.ejercicio17;

import java.time.LocalDate;

public interface Politica {
	double calcularReembolso(DateLapse reserva, LocalDate fechaCancelacion, double precioNoche);
}
