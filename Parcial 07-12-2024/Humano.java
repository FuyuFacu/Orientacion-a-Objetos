package ar.edu.unlp.info.oo1.EjercicioParcial2024;

public class Humano extends Personaje{

	public Humano(String nombre, Rol rol) {
		super(nombre, rol, 2, 1);
	}
	
	public double determinarPoderAtaque(int hora) {
		double valorbase = this.getRol().getValorBase(this);
		if (hora > 8 && hora < 20) return valorbase * 1.40;
		return valorbase;
	}
	
	public void subirNivel()
	{
		if (this.getNivel() >= 7)
		{
			this.getRol().subirHabilidades(this);
		}
		this.incrementarNivel();
	}
	
}
