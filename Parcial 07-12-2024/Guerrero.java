package ar.edu.unlp.info.oo1.EjercicioParcial2024;

public class Guerrero implements Rol{
	
	
	public double getValorBase(Personaje P) {
		return (P.getFuerza() * 2) + P.getNivel() + P.getInteligencia();
	}
	
	public void subirHabilidades(Personaje P)
	{
		double calculo = (P.getNivel() / 6);
		P.subirFuerza(calculo);
	}
}
