package ar.edu.unlp.info.oo1.ejercicio20;

import java.time.LocalDate;

public class PorHoras extends Contrato{
	private int horasMensuales;
	private double valorHora;
	private LocalDate finContrato;
	
	
	
	
	public PorHoras(LocalDate inicio, int horasMensuales, double valorHora, LocalDate finContrato) {
		super(inicio);
		this.horasMensuales = horasMensuales;
		this.valorHora = valorHora;
		this.finContrato = finContrato;
	}

	public boolean esActivo()
	{
		return LocalDate.now().isBefore(finContrato);
	}
	
	public double calcularMonto()
	{
		return valorHora * horasMensuales;
	}

	public int getHorasMensuales() {
		return horasMensuales;
	}

	public void setHorasMensuales(int horasMensuales) {
		this.horasMensuales = horasMensuales;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	public LocalDate getFinContrato() {
		return finContrato;
	}

	public void setFinContrato(LocalDate finContrato) {
		this.finContrato = finContrato;
	}
	
	
	
}
