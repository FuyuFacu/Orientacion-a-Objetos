package ar.edu.unlp.info.oo1.ejercicio5;

public class Circulo  extends Figura{
	private double radio;

	
	
	public Circulo() {}
	
	
	
	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	public void setDiametro(double diametro) {
		 this.radio = diametro/2;
	}
	
	public double getRadio() {
		return this.radio;
	}
	
	public double getDiametro() {
		return this.radio * 2;
	}
	
	public double getPerimetro() {
		return Math.PI * this.radio * 2;
	}
	
	public double getArea() {
		return Math.PI * Math.pow(radio, 2);
	}
	
	
	
	
	
	
	
}
