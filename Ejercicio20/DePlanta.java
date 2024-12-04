package ar.edu.unlp.info.oo1.ejercicio20;

import java.time.LocalDate;

public class DePlanta extends Contrato{
	private double sueldoMensual;
	private double montoConyuge;
	private double montoHijos;
	
	
	
	
	public DePlanta(LocalDate inicio, double sueldoMensual, double montoConyuge, double montoHijos) {
		super(inicio);
		this.sueldoMensual = sueldoMensual;
		this.montoConyuge = montoConyuge;
		this.montoHijos = montoHijos;
	}

	public boolean esActivo()
	{
		return this.getInicio().isBefore(LocalDate.now());
	}
	
	public double calcularMonto()
	{
		return sueldoMensual + montoConyuge + montoHijos;
	}

	public double getSueldoMensual() {
		return sueldoMensual;
	}

	public void setSueldoMensual(double sueldoMensual) {
		this.sueldoMensual = sueldoMensual;
	}

	public double getMontoConyuge() {
		return montoConyuge;
	}

	public void setMontoConyuge(double montoConyuge) {
		this.montoConyuge = montoConyuge;
	}

	public double getMontoHijos() {
		return montoHijos;
	}

	public void setMontoHijos(double montoHijos) {
		this.montoHijos = montoHijos;
	}
	
	

}
