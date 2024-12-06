package ar.edu.unlp.info.oo1.ejercicio24;


public class Conductor extends Usuario{
	private Vehiculo vehiculo;

	public Conductor(String nombre, double saldo, Vehiculo vehiculo) {
		super(nombre, saldo);
		this.vehiculo = vehiculo;
	}
	
	
	public void descontar(double costo) 
	{
		double total = costo - vehiculo.getValorMercado() * 0.1;
		this.Cobrar(total);
		
	}
	
	
	public void cargarSaldo(double monto)
	{
		if (vehiculo.getAntiguedad() < 5)
		{
			monto *= 1.01;
		} else monto *= 1.10;
		
		this.transferir(monto);
	}
	
}
