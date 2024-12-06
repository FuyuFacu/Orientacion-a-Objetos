package ar.edu.unlp.info.oo1.ejercicio24;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Vehiculo {
	private String dueno;
	private String descripcion;
	private int cantPasajeros;
	private LocalDate fechaFabricacion;
	private double valorMercado;
	
	
	public Vehiculo(String dueno, String descripcion, int cantPasajeros, LocalDate fechaFabricacion,
			double valorMercado) {
		super();
		this.dueno = dueno;
		this.descripcion = descripcion;
		this.cantPasajeros = cantPasajeros;
		this.fechaFabricacion = fechaFabricacion;
		this.valorMercado = valorMercado;
	}


	public int getCantPasajeros() {
		return cantPasajeros;
	}


	public double getValorMercado() {
		return valorMercado;
	}


	public long getAntiguedad() {
		return ChronoUnit.YEARS.between(this.fechaFabricacion, LocalDate.now());
	}




	

	

	
	
	
	
	
	
}
