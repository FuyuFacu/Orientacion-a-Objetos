package ar.edu.unlp.info.oo1.EjercicioParcial2024;

public class Sede {
	private String nombre;
	private double precioEstadiaPorDia;
	private int cantDias;
	
	
	public Sede(String nombre, double precioEstadiaPorDia, int cantDias) {
		super();
		this.nombre = nombre;
		this.precioEstadiaPorDia = precioEstadiaPorDia;
		this.cantDias = cantDias;
	}



	public double getPrecioEstadia()
	{
		return this.cantDias * this.precioEstadiaPorDia;
	}


	public String getNombre() {
		return nombre;
	}
	
	
	
	
}
