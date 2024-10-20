package ar.edu.unlp.info.oo1.ejercicio2;

import java.time.LocalDate;

public class Ticket {
	private LocalDate fecha = LocalDate.now();
	private int cantidadDeProductos;
	private double pesoTotal;
	private double precioTotal;
	
	public Ticket() {}
	
	public double impuesto() {
		double total = (this.precioTotal*0.21);
		return total;
	}


	public LocalDate getFecha() {
		return fecha;
	}


	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}


	public int getCantidadDeProductos() {
		return cantidadDeProductos;
	}


	public void setCantidadDeProductos(int cantidadDeProductos) {
		this.cantidadDeProductos = cantidadDeProductos;
	}


	public double getPesoTotal() {
		return pesoTotal;
	}


	public void setPesoTotal(double pesoTotal) {
		this.pesoTotal = pesoTotal;
	}


	public double getPrecioTotal() {
		return precioTotal;
	}


	public void setPrecioTotal(double precioTotal) {
		this.precioTotal = precioTotal;
	}
	
	
	
	
	
	
	
}
