package ar.edu.unlp.info.oo1.ejercicio24;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pasajero extends Usuario{

	public Pasajero(String nombre, double saldo) {
		super(nombre, saldo);
	}

	public void registrarViaje(Viaje V)
	{
		long cantDias = ChronoUnit.DAYS.between(LocalDate.now(), V.getFechaViaje());
		if (this.getSaldo() >= 0 && cantDias > 2)
		{
			V.agregarPasajero(this);
		}
	}
	
	public void descontar(double costo) 
	{
		if (this.ViajeAnterior())
		{
			double total = costo - 500;
			this.Cobrar(total);
		}
	}
	
	public void cargarSaldo(double monto)
	{
		if (this.ViajeAnterior30Dias())
		{
			monto *= 1.10;
		}
		this.transferir(monto);
	}
	
}
