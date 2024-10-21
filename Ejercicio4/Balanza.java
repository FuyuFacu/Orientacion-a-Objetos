package ar.edu.unlp.info.oo1.ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Balanza {
	private List<Producto> productos;
	
	public Balanza() {
		productos = new ArrayList<Producto>();
	}
	
	public void agregarProducto(Producto P) {
		productos.add(P);
	}
	
	public Ticket emitirTicket() {
		Ticket T = new Ticket();
		T.setCantidadDeProductos(this.getCantidadDeProductos());
		T.setPesoTotal(this.getPesoTotal());
		T.setPrecioTotal(this.getPrecioTotal());
		ponerEnCero();	
		return T;
	}
	
	public void ponerEnCero() {
		productos.clear();
	}
	
	public double getPesoTotal() {
		double total = 0;
		for (Producto producto : productos) {
			total += producto.getPeso();
		}
		return total;
	}
	
	public double getPrecioTotal() {
		double precio = 0;
		for (Producto producto : productos) {
			precio += producto.getPrecio();			
		}
		
		return precio;
	}
	
	public int getCantidadDeProductos() {
		return productos.size();
	}
	
}
