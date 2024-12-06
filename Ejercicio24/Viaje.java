package ar.edu.unlp.info.oo1.ejercicio24;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class Viaje {
	private String origen;
	private String destino;
	private double costoTotal;
	private Vehiculo vehiculo;
	private LocalDate fechaViaje;
	private List<Usuario> pasajeros;
	
	
	public Viaje(String origen, String destino, double costoTotal, Vehiculo vehiculo, LocalDate fechaViaje) {
		this.origen = origen;
		this.destino = destino;
		this.costoTotal = costoTotal;
		this.vehiculo = vehiculo;
		this.fechaViaje = fechaViaje;
		this.pasajeros = new ArrayList<>();
	}
	

	public void agregarPasajero(Usuario S)
	{
		if (this.vehiculo.getCantPasajeros() < pasajeros.size())
		{
			this.pasajeros.add(S);
		}
	}


	public LocalDate getFechaViaje() {
		return fechaViaje;
	}


	public void procesarViaje()
	{
		double costoUnitario = this.costoTotal / this.pasajeros.size();
		for (var u : pasajeros)
		{
			u.descontar(costoUnitario);
		}
	}
	
	public boolean anterior(LocalDate Fecha)
	{
		return this.fechaViaje.isAfter(Fecha);
	}
	
	public boolean anterior30(LocalDate Fecha)
	{
		long cantDias = ChronoUnit.DAYS.between(Fecha, LocalDate.now());
		return cantDias > 30;
	}
	
	

	
}
