package ar.edu.unlp.info.oo1.EjercicioParcial2024;

import java.time.LocalDate;

public abstract class Evento {
	private String nombre;
	private LocalDate fecha;
	private String temaPrincipal;
	private double precioInscripcion;
	private double precioRemera;

	
	public Evento(String nombre, LocalDate fecha, String temaPrincipal, double precioInscripcion, double precioRemera) {
		this.nombre = nombre;
		this.fecha = fecha;
		this.temaPrincipal = temaPrincipal;
		this.precioInscripcion = precioInscripcion;
		this.precioRemera = precioRemera;
	}

	public double getPrecioInscripcion() {
		return precioInscripcion;
	}

	public double getPrecioRemera() {
		return precioRemera;
	}

	public LocalDate getFecha()
	{
		return fecha;
	}

	public double consultaMismoDia(double precioBase, LocalDate F)
	{
		if (fecha.isEqual(F))
		{
			return precioBase * 1.20;
		}
		return precioBase;
	}


	public String getNombre() {
		return nombre;
	}

	public String getTemaPrincipal() {
		return temaPrincipal;
	}

	public abstract double getPrecioEntrada(LocalDate fechaConsulta);
	
}
