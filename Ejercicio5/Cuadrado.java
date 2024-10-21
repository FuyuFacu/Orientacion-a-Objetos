package ar.edu.unlp.info.oo1.ejercicio5;

public class Cuadrado implements Figura{
	private int lado;
	
	
	public Cuadrado() {}
	
	
	public void setLado(int lado) {
		this.lado = lado;
	}
	
	public double getLado() {
		return this.lado;
	}
	
	public double getPerimetro() {
		return lado * 4;
	}
	
	public double getArea() {
		return lado * lado;
	}
	
	
}
