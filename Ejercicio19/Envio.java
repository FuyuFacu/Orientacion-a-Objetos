package ar.edu.unlp.info.oo1.ejercicio19;

import java.time.LocalDate;

public abstract class Envio {
	private LocalDate fechaDespacho;
	private int dirOrigen;
	private int dirDestino;
	private double peso;
	
	
	public Envio(LocalDate fechaDespacho, int dirOrigen, int dirDestino, double peso) {
		super();
		this.fechaDespacho = fechaDespacho;
		this.dirOrigen = dirOrigen;
		this.dirDestino = dirDestino;
		this.peso = peso;
	}



	
	public int getDistancia()
	{
		return this.dirOrigen - this.dirDestino;
	}


	public LocalDate getFechaDespacho() {
		return fechaDespacho;
	}





	public void setFechaDespacho(LocalDate fechaDespacho) {
		this.fechaDespacho = fechaDespacho;
	}





	public int getDirOrigen() {
		return dirOrigen;
	}





	public void setDirOrigen(int dirOrigen) {
		this.dirOrigen = dirOrigen;
	}





	public int getDirDestino() {
		return dirDestino;
	}





	public void setDirDestino(int dirDestino) {
		this.dirDestino = dirDestino;
	}





	public double getPeso() {
		return peso;
	}





	public void setPeso(double peso) {
		this.peso = peso;
	}





	public abstract double montoPagar();
	
}
