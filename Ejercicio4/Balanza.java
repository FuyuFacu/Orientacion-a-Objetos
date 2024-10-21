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
	
	public List<Producto> getProductos() {
		return productos;  // retorno directamente la lista
	}
	
	
	
	public void ponerEnCero() {
		productos.clear(); // mando a Oklahoma los elementos que haya en la lista
	}
	
	public double getPesoTotal() {
		double total = 0;
		for (Producto producto : productos) {
			total += producto.getPeso(); // sumo el peso de los productos que hay dentro de la lista
		}
		return total;
		// o si queres hacerte el actually
		// return productos.stream().mapToDouble(producto -> producto.getPeso()).sum();
		// recordar importar java.util.stream para que funcione esto.
	}
	
	public double getPrecioTotal() {
		double precio = 0;
		for (Producto producto : productos) {
			precio += producto.getPrecio();	// sumo por cada producto que haya en la lista, si no hay ninguno no se ejecuta este for	
		}
		
		return precio;
	}
	
	public int getCantidadDeProductos() {
		return productos.size(); //Retorna numero de productos
	}
	

}
