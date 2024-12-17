package ar.edu.unlp.info.oo1.EjercicioParcial2024;

import java.time.LocalDate;

public class EventoVirtual extends Evento{
	private double montoFijoEnvio;
	
	
	public EventoVirtual(String nombre, LocalDate fecha, String temaPrincipal, double precioInscripcion,
			double precioRemera, double montoFijoEnvio) {
		super(nombre, fecha, temaPrincipal, precioInscripcion, precioRemera);
		this.montoFijoEnvio = montoFijoEnvio;
	}

	public double getPrecioEntrada(LocalDate fechaConsulta)
	{
		double precio = this.getPrecioInscripcion() + this.getPrecioRemera();
		sumarCostoEnvio(precio);
		return this.consultaMismoDia(precio,fechaConsulta); 
	}
	
	public void sumarCostoEnvio(double precio)
	{
		precio += montoFijoEnvio;
	}
}
