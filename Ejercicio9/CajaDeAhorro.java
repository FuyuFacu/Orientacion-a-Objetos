package ar.edu.unlp.info.oo1.ejercicio9;

public class CajaDeAhorro extends Cuenta{

	public CajaDeAhorro() {
		super();
	}
	
	@Override
	public boolean puedeExtraer(double monto) {
		if (super.getSaldo() >= (monto + monto * 0.02)) {
			return true;
		}
		return false;
	}
	
	public void depositar(double monto) {
		double montoCosto = monto - (monto *0.02);
		super.depositar(montoCosto);
	}

	public boolean extraer(double monto) {
		double montoCosto = monto + (monto * 0.02);
		if (puedeExtraer(montoCosto)) {
			super.extraerSinControlar(montoCosto);
			return true;
		}
		return false;
	}
	
	public boolean transferirACuenta(double monto, Cuenta cuentaDestino) {
		double montoCosto = monto + (monto*0.02);
		if (this.puedeExtraer(montoCosto)) {
			super.extraerSinControlar(montoCosto);
			cuentaDestino.depositar(monto);
			return true;
		}
		return false;
	}
	
	
}
