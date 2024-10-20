package ar.edu.unlp.info.oo1.ejercicio2;

public class Balanza {
	private int cantidadDeProductos;
	private double precioTotal;
	private double pesoTotal;
	
	public Balanza() {}
	
	public void agregarProducto(Producto P) {
		this.cantidadDeProductos++;
		this.precioTotal += P.getPrecio();
		this.pesoTotal += P.getPeso();
	}
	
	public Ticket emitirTicket() {
		Ticket T = new Ticket();
		T.setCantidadDeProductos(this.cantidadDeProductos);
		T.setPesoTotal(this.pesoTotal);
		T.setPrecioTotal(this.precioTotal);
		ponerEnCero();	
		return T;
	}
	
	public void ponerEnCero() {
		this.cantidadDeProductos = 0;
		this.precioTotal = 0;
		this.pesoTotal = 0;
	}
	
	public double getPesoTotal() {
		return this.pesoTotal;
	}
	
	public double getPrecioTotal() {
		return this.precioTotal;
	}
	
	public int getCantidadDeProductos() {
		return this.cantidadDeProductos;
	}
	
	
	
	
	
	
}
