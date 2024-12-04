package ar.edu.unlp.info.oo1.ejercicio19;

import java.time.LocalDate;

public class EnvioLocal extends Envio{
	private boolean EntregaRapida;
	
	
	public EnvioLocal(LocalDate fechaDespacho, int dirOrigen, int dirDestino, double peso, boolean Entrega) {
		super(fechaDespacho, dirOrigen, dirDestino, peso);
		this.EntregaRapida = Entrega;
	}

	@Override
	public double montoPagar() {
		if (EntregaRapida)
		{
			return 1000 + 500;
		} else return 1000;
	}

	
	
	
}
