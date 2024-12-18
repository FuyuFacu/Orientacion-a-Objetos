package ar.edu.unlp.info.oo1.EjercicioParcial2024;

import java.util.List;
import java.util.stream.Collectors;

public abstract class Personaje {
	private String nombre;
	private Rol rol;
	private int inteligencia;
	private int nivel = 1;
	private int fuerza;
	
	
	public Personaje(String nombre, Rol rol, int inteligencia, int fuerza) {
		this.nombre = nombre;
		this.rol = rol;
		this.inteligencia = inteligencia;
		this.fuerza = fuerza;
	}
	
	
	public void EnfrentamientoUnoAUno(Personaje P, int momentoDia)
	{
		double poderAtaque1 = this.determinarPoderAtaque(momentoDia);
		double poderAtaque2 = P.determinarPoderAtaque(momentoDia);
		
		if (poderAtaque1 > poderAtaque2) this.subirNivel();
		else P.subirNivel();
	}
	
	public List<Personaje> BuscarOponenteSimilar(List<Personaje> personajes)
	{
		return personajes.stream()
				.filter(x -> x.getNivel() == this.getNivel() || Math.abs(x.getNivel() - this.getNivel()) <= 2)
				.filter(x -> x.determinarPoderAtaque(12) <= 2)
				.collect(Collectors.toList());
	}
	
	
	public void subirInteligencia(double cantidad)
	{
		this.inteligencia += cantidad;
	}
	
	public void subirFuerza(double cantidad)
	{
		this.fuerza += cantidad;
	}
	
	public void cambiarRol(Rol rol)
	{
		this.rol = rol;
	}

	public int getInteligencia() {
		return inteligencia;
	}

	public int getFuerza() {
		return fuerza;
	}

	public int getNivel() {
		return nivel;
	}
	
	public Rol getRol()
	{
		return this.rol;
	}
	
	public void incrementarNivel()
	{
		this.nivel++;
	}
	
	
	public String getNombre() {
		return nombre;
	}


	public abstract void subirNivel();
	public abstract double determinarPoderAtaque(int hora);
	
	
}
