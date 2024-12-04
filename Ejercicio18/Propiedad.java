package ar.edu.unlp.info.oo1.ejercicio17;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Propiedad {
	private String direccion;
	private String nombre;
	private double precioNoche;
	private List<DateLapse> reservas;
	private Politica politicaReembolso;
	
	
	public Propiedad(String direccion, String nombre, double precioNoche, Politica P) {
		super();
		this.direccion = direccion;
		this.nombre = nombre;
		this.precioNoche = precioNoche;
		this.reservas = new ArrayList<>();
		this.politicaReembolso = P;
	}

	
	public boolean revisarDisponibilidad(DateLapse D)
	{
		long fechas = this.reservas.stream().filter(F -> F.superpone(D)).count();
		return (fechas == 0);
	}
	
	public double calcularTotal(LocalDate from, LocalDate to)
	{
		DateLapse aux = new DateLapse(from,to);
		return this.reservas.stream().filter(x -> x.superpone(aux)).mapToDouble(x -> this.precioReserva(x)).sum() * 0.75;
		
	}
	

	public boolean agregarReserva(DateLapse R)
	{
		if (R != null) 
		{
			if (this.revisarDisponibilidad(R)) this.reservas.add(R);
			return true;
		}
		return false;
	}
	
	public double precioReserva(DateLapse D)
	{
		return this.getPrecioNoche() * D.getDays();
	}
	
	public boolean removerPeriodo(DateLapse D)
	{
		LocalDate now = LocalDate.now();
		
		if (D.getFrom().isAfter(now) || D.getTo().isBefore(now))
		{
			this.reservas.remove(D);
			return true;
		}
		return false;
	}
	
	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public double getPrecioNoche() {
		return precioNoche;
	}


	public void setPrecioNoche(double precioNoche) {
		this.precioNoche = precioNoche;
	}


	public List<DateLapse> getReservas() {
		return reservas;
	}


	public void setReservas(List<DateLapse> reservas) {
		this.reservas = reservas;
	}


	public Politica getPoliticaReembolso() {
		return politicaReembolso;
	}


	public void setPoliticaReembolso(Politica politicaReembolso) {
		this.politicaReembolso = politicaReembolso;
	}
	
	
	
	
	
	
	
	
	
}
