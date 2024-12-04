package ar.edu.unlp.info.oo1.ejercicio17;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private String nombre;
	private int DNI;
	private String direccion;
	private List<Propiedad> propiedadesDeseadas;
	private List<Propiedad> alquileres;
	
	
	public Usuario(String nombre, int dNI, String direccion) {
		this.nombre = nombre;
		DNI = dNI;
		this.direccion = direccion;
		this.propiedadesDeseadas = new ArrayList<>();
		this.alquileres = new ArrayList<>();
		
	}
	
	public void agregarPropiedad(Propiedad P)
	{
		if (P != null) this.propiedadesDeseadas.add(P);
	}
	
	public void crearReserva(Propiedad P,DateLapse D)
	{
		if (D != null && P.agregarReserva(D)) // con esto matamos a dos pajaros de un tiro, ya que agrego la reserva y recibo feedback si la operación se realizó con exito
		{
			this.alquileres.add(P);
		}
	}

	public List<Propiedad> getAlquileres() {
		return alquileres;
	}

	public void setAlquileres(List<Propiedad> alquileres) {
		this.alquileres = alquileres;
	}
	
	public double calcularIngresos(LocalDate from, LocalDate to)
	{
		return this.alquileres.stream().mapToDouble(a -> a.calcularTotal(from,to)).sum();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDNI() {
		return DNI;
	}

	public void setDNI(int dNI) {
		DNI = dNI;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public List<Propiedad> getPropiedadesDeseadas() {
		return propiedadesDeseadas;
	}

	public void setPropiedadesDeseadas(List<Propiedad> propiedadesDeseadas) {
		this.propiedadesDeseadas = propiedadesDeseadas;
	}
	
	
	
	
	
	
	
	
	
	
}
