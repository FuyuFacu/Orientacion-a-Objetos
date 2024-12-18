package ar.edu.unlp.info.oo1.EjercicioParcial2024;

public class Orco extends Personaje{

	public Orco(String nombre, Rol rol, int inteligencia, int fuerza) {
		super(nombre, rol, 1, 2);
	}
	
	
	public double determinarPoderAtaque(int hora) {
		double valorbase = this.getRol().getValorBase(this);
		if (hora > 20 && hora < 24 || hora < 8 && hora > 0) return valorbase * 1.60;
		return valorbase;
	}


	@Override
	public void subirNivel()
	{
		if (this.getNivel() % 3 == 0)
		{
			this.getRol().subirHabilidades(this);
		}
		this.incrementarNivel();
	}
}
