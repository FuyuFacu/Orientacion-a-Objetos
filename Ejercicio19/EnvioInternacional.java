package ar.edu.unlp.info.oo1.ejercicio19;

import java.time.LocalDate;

public class EnvioInternacional extends Envio{

	
	public EnvioInternacional(LocalDate fechaDespacho, int dirOrigen, int dirDestino, double peso) {
		super(fechaDespacho, dirOrigen, dirDestino, peso);
	}
	
	

	@Override
	public double montoPagar()
	{
		double peso = super.getPeso();
		if (peso <= 1000)
		{
			return 5000 + (peso * 10);
		} else if (peso > 1000)
		{
			return 5000 + (peso * 12);
		}
		return 0;
	}
}
