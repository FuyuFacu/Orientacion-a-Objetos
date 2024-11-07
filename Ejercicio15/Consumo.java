package ar.edu.unlp.info.oo1.ejercicio15;

public class Consumo {
	private int kwh;
	private int kvarh;

	
	public Consumo(int kwh, int kvarh) {
		this.kwh = kwh;
		this.kvarh = kvarh;
	}

	public double getEnergiaActiva()
	{
		return kwh;
	}
	
	public double getEnergiaReactiva()
	{
		return kvarh;
	}
	
	
	
}
