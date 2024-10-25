package ar.edu.unlp.info.oo1.ejercicio11;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;



public class PlazoFijo implements InversionTipo{
	private LocalDate fecha;
	double montoDepositado;
	double porcentajeDeInteresDiario;
	
	
	
	public PlazoFijo(LocalDate fecha, double monto, double porcentaje) {
		this.fecha = fecha;
		this.montoDepositado = monto;
		this.porcentajeDeInteresDiario = porcentaje;
	}
	
	
	// long cantidadDias = ChronoUnit.DAYS.between(fechaDeConstitucion, LocalDate.now());
	
	public double valorActual() {
		double porcentaje = porcentajeDeInteresDiario / 100;
		long cant = ChronoUnit.DAYS.between(fecha, LocalDate.now());
		return montoDepositado * Math.pow(1 + porcentaje,cant);
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public double getMontoDepositado() {
		return montoDepositado;
	}

	public void setMontoDepositado(double montoDepositado) {
		this.montoDepositado = montoDepositado;
	}

	public double getPorcentajeDeInteresDiario() {
		return porcentajeDeInteresDiario;
	}

	public void setPorcentajeDeInteresDiario(double porcentajeDeInteresDiario) {
		this.porcentajeDeInteresDiario = porcentajeDeInteresDiario;
	}
	
	
	
	
}
