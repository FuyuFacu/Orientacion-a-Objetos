package ar.edu.unlp.info.oo1.EjercicioParcial2024;

public class Mago implements Rol{
	
	public double getValorBase(Personaje P) {
		return (P.getInteligencia() + P.getNivel()) * 2;
	}
	
	
	public void subirHabilidades(Personaje P)
	{
		double calculo = (P.getNivel() * 3/2);
		P.subirInteligencia(calculo);
	}
}
