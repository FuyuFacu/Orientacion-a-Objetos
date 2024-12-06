package ar.edu.unlp.info.oo1.ejercicio24;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Usuario {
	private String nombre;
	private double saldo;
	private List<Viaje> viajes;
	
	public Usuario(String nombre, double saldo) {
		super();
		this.nombre = nombre;
		this.saldo = saldo;
		this.viajes = new ArrayList<>();
	}

	public double getSaldo() {
		return saldo;
	}

	public void Cobrar(double monto)
	{
		this.saldo-= monto;
	}
	
	public boolean ViajeAnterior()
	{
		return this.viajes.stream().anyMatch(v -> v.anterior(LocalDate.now()));
	}
	
	public boolean ViajeAnterior30Dias()
	{
		return !this.viajes.stream().anyMatch(v -> v.anterior30(LocalDate.now()));
	}
	
	public void transferir(double monto)
	{
		this.saldo += monto;
	}
	
	public void agregarViaje(Viaje V)
	{
		this.viajes.add(V);
	}
	

	
	public abstract void cargarSaldo(double monto);
	public abstract void descontar(double costo);
	
}
