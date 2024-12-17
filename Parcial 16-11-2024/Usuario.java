package ar.edu.unlp.info.oo1.EjercicioParcial2024;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Usuario {
	private String nombre;
	private List<Entrada> entradas;
	
	public Usuario(String nombre) {
		super();
		this.nombre = nombre;
		this.entradas = new ArrayList<>();
	}

	public double consultarPrecioEntrada(Evento E, LocalDate fechaConsulta)
	{
		return E.getPrecioEntrada(fechaConsulta);
	}
	
	public void comprarEntrada(Evento E, boolean seguro)
	{
		if (E != null) {
			this.entradas.add(new Entrada(E,seguro,LocalDate.now()));
		}
	}
	
	public double montoTotalDuranteFechas(LocalDate fechaInicial, LocalDate fechaFinal)
	{
		return this.entradas.stream()
			       .filter(x -> x.getFechaCompra().isAfter(fechaInicial) && x.getFechaCompra().isBefore(fechaFinal))
			       .mapToDouble(x -> x.getMontoTotal()).sum();
	}
	
	public Entrada retornarEntradaCercana()
	{
		LocalDate hoy = LocalDate.now();
		return this.entradas.stream()
				.filter(x -> x.getFechaCompra().isAfter(hoy))
				.min(Comparator.comparingLong(p -> ChronoUnit.DAYS.between(hoy, p.getFechaCompra())))
				.orElse(null);
	}

	public String getNombre() {
		return nombre;
	}
	
	
	
}
