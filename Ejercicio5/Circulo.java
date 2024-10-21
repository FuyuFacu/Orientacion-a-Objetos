package ar.edu.unlp.info.oo1.ejercicio5;

public class Circulo  implements Figura{
	private double radio;
	// private double Diametro; segun chatgpt si directamento
	// calculo el diametro haciendo this.radio * 2 el diametro
	// no se desincronizaria??. Gracias a eso me anduvo el programa....
	// ya que me tiraba un failure en cilindro.getSuperficieExterior
	// por culpa del maldito diametro
	
	
	public Circulo() {}
	
	
	
	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	public void setDiametro(double diametro) {
		this.radio = diametro / 2;
	}
	
	public double getRadio() {
		return this.radio;
	}
	
	public double getDiametro() {
		return this.radio * 2;
	}
	
	public double getPerimetro() {
		return Math.PI * getDiametro();
	}
	
	public double getArea() {
		return Math.PI * Math.pow(radio, 2);
	}
	
	
	
	
	
	
	
}
