package ar.edu.unlp.info.oo1.EjercicioParcial2024;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Entrada {
	private Evento evento;
	private boolean seguroReembolso;
	private LocalDate fechaCompra;
	
	public Entrada(Evento evento, boolean seguroReembolso, LocalDate fechaCompra) {
		super();
		this.evento = evento;
		this.seguroReembolso = seguroReembolso;
		this.fechaCompra = fechaCompra;
	}
	
	public double montoARecuperar()
	{
		double montoTotal = 0;
		long diferenciaDias = ChronoUnit.DAYS.between(fechaCompra, evento.getFecha());
		
		if (diferenciaDias >= 30) {
			adicionarPorcentaje(montoTotal, 0.5);
		}
		
		if (seguroReembolso) {
			adicionarPorcentaje(montoTotal, 0.15);
		}
		
		return montoTotal;
	}
	
	public void adicionarPorcentaje(double monto, double porcentaje)
	{
		monto += evento.getPrecioInscripcion() * porcentaje;
	}

	public LocalDate getFechaCompra() {
		return fechaCompra;
	}

	public double getMontoTotal()
	{
		double monto = this.evento.getPrecioInscripcion();
		if (seguroReembolso) monto += 500;
		return monto;
	}
	
	
}
