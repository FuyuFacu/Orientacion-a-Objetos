package ar.edu.unlp.info.oo1.EjercicioParcial2024;

import java.time.LocalDate;
import java.util.List;

public class EventoPresencial extends Evento{
	private List<Sede> sedes;
	
	
	public EventoPresencial(String nombre, LocalDate fecha, String temaPrincipal, double precioInscripcion,
			double precioRemera, List<Sede> sedes) {
		super(nombre, fecha, temaPrincipal, precioInscripcion, precioRemera);
		this.sedes = sedes;
	}

	public double getPrecioEntrada(LocalDate fechaConsulta)
	{
		double precio = this.getPrecioInscripcion() + this.getPrecioRemera() + getPrecioEstadiasTotal();
		return this.consultaMismoDia(precio, fechaConsulta);
	}
	
	public double getPrecioEstadiasTotal()
	{
		return this.sedes.stream().mapToDouble(x -> x.getPrecioEstadia()).sum();
	}
	
}
