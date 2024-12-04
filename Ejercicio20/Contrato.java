package ar.edu.unlp.info.oo1.ejercicio20;

import java.time.LocalDate;

public abstract class Contrato {
	private LocalDate inicio;
	
	
	
	
	public Contrato(LocalDate inicio) {
		super();
		this.inicio = inicio;
	}

	public LocalDate getInicio() {
		return inicio;
	}

	public void setInicio(LocalDate inicio) {
		this.inicio = inicio;
	}
	
	public abstract double calcularMonto();
	public abstract boolean esActivo();
	
}
