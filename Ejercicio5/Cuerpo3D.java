package ar.edu.unlp.info.oo1.ejercicio5;

public class Cuerpo3D {
	private double altura;
	private Figura caraBasal;
	
	public Cuerpo3D() {}
	
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public Figura getCaraBasal() {
		return caraBasal;
	}
	public void setCaraBasal(Figura caraBasal) {
		this.caraBasal = caraBasal;
	}
	
	public double getVolumen() {
		return caraBasal.getArea() * altura;
	}
	
	public double getSuperficieExterior() {
		return (2 * caraBasal.getArea() + caraBasal.getPerimetro() * altura);
	}
	
	
	
	
	
}
