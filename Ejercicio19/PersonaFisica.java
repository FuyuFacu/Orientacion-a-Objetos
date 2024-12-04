package ar.edu.unlp.info.oo1.ejercicio19;

public class PersonaFisica extends Persona{
	private int DNI;

	public PersonaFisica(String nombre, String direccion, int dNI) {
		super(nombre, direccion);
		DNI = dNI;
	}
	
	
	public double calcularMonto()
	{
		double total = this.getEnvios().stream().mapToDouble(x -> x.montoPagar()).sum();
		return total * 0.9;
	}


	public int getDNI() {
		return DNI;
	}


	public void setDNI(int dNI) {
		DNI = dNI;
	}
		
	
	
	
	
	
}
