package ar.edu.unlp.info.oo1.ejercicio20;

import java.time.LocalDate;

public class Recibo {
	private String nombre;
	private String apellido;
	private int CUIL;
	private int antiguedad;
	private LocalDate FechaGenerado;
	private double montoCorrespondido;
	
	
	public Recibo(String nombre, String apellido, int cUIL, int antiguedad, double montoCorrespondido) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		CUIL = cUIL;
		this.antiguedad = antiguedad;
		FechaGenerado = LocalDate.now();
		this.montoCorrespondido = montoCorrespondido;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public int getCUIL() {
		return CUIL;
	}


	public void setCUIL(int cUIL) {
		CUIL = cUIL;
	}


	public int getAntiguedad() {
		return antiguedad;
	}


	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}


	public LocalDate getFechaGenerado() {
		return FechaGenerado;
	}


	public void setFechaGenerado(LocalDate fechaGenerado) {
		FechaGenerado = fechaGenerado;
	}


	public double getMontoCorrespondido() {
		return montoCorrespondido;
	}


	public void setMontoCorrespondido(double montoCorrespondido) {
		this.montoCorrespondido = montoCorrespondido;
	}
	
	
	
}
