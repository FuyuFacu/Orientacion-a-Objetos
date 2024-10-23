package ar.edu.unlp.info.oo1.ejercicio9;

public class CuentaCorriente extends Cuenta{
	private double limite;

	public CuentaCorriente() {
		super();
		this.limite = 0;
	}
	
	
	public boolean puedeExtraer(double monto) {
		if ((super.getSaldo() - monto) >= getLimite()) {
			return true;
		}
		return false;
	}


	public double getLimite() {
		return limite;
	}


	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	
	
}
