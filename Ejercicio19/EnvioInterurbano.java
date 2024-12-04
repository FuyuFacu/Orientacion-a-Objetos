package ar.edu.unlp.info.oo1.ejercicio19;

import java.time.LocalDate;

public class EnvioInterurbano extends Envio{
	public EnvioInterurbano(LocalDate fechaDespacho, int dirOrigen, int dirDestino, double peso) {
		super(fechaDespacho, dirOrigen, dirDestino, peso);
	}
	

	public double montoPagar()
	{
		double peso = super.getPeso();
		int distancia = super.getDistancia();
		if (distancia < 100)
		{
			return 20 * peso;
		} else if (distancia >= 100 && distancia <= 500)
		{
			return 25 * peso;
		} else if (distancia > 500)
		{
			return 30 * peso;
		}
		return 0;
	}

}
