package ar.edu.unlp.info.oo1.ejercicio15;
import java.time.LocalDate;

public class Factura {
	private Usuario usuario;
	private double monto;
	private boolean bonificacion = false;
	
	public Factura(Usuario usuario) 
	{
		this.usuario = usuario;
	}
	
	
	public void getCosto()
	{
		Consumo ultimoConsumo = usuario.getUltimoConsumo();
		if (ultimoConsumo == null)
		{
			System.out.println("No existe ningun consumo de energia...");
			this.monto = 0;
			return;
		}
		
		double costoConsumo = ultimoConsumo.getEnergiaActiva() * usuario.getPrecio();
		double factorPotencia = ultimoConsumo.getEnergiaActiva() / 
				Math.sqrt(Math.pow(ultimoConsumo.getEnergiaActiva(), 2) 
						+ Math.pow(ultimoConsumo.getEnergiaReactiva(), 2));
		if (factorPotencia > 0.8)
		{
			this.bonificacion = true;
			costoConsumo = costoConsumo * 0.90;
		}
		
		this.monto = costoConsumo;
	}
	
	public String emitirFactura()
	{
		getCosto();
		String aux = usuario.getNombre() + "\nFecha de emision: " + LocalDate.now() +
				"\n" + usuario.getDomicilio() + "\nBonificacion: ";
		
		if (bonificacion) {
			aux += "Si";
		} else {
			aux += "No";
		}
		
		aux += " \nMonto final: " + this.monto;
		return aux;
	}
	
	
	
	
	
}
