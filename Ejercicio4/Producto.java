package ar.edu.unlp.info.oo1.ejercicio4;

public class Producto {
	private double peso;
	private double precioPorKilo;
	private String descripcion;
	
	
	public Producto() {}
	
	
	public double getPrecio() {
		double total = (this.precioPorKilo * this.peso);
		return total;
	}
	
	
	public void setPeso(double d) {
		this.peso = d;
	}
	
	public double getPeso() {
		return this.peso;
	}
	
	public void setPrecioPorKilo(double p) {
		this.precioPorKilo = p;
	}
	
	public double getPrecioPorKilo() {
		return this.precioPorKilo;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public String getDescripcion() {
		return this.descripcion;
	}
	
	
	
	
	
	
	
}
