package ar.edu.unlp.info.oo1.ejercicio19;


public class ClienteCorporativo extends Persona{
	private int CUIT;

	public ClienteCorporativo(String nombre, String direccion, int cUIT) {
		super(nombre, direccion);
		CUIT = cUIT;
	}
	
	public double calcularMonto()
	{
		return this.getEnvios().stream().mapToDouble(x -> x.montoPagar()).sum();
	}

	public int getCUIT() {
		return CUIT;
	}

	public void setCUIT(int cUIT) {
		CUIT = cUIT;
	}
	
	
	
	
}
