package io.github.unlp_oo.Ejercicio13;

import java.util.ArrayList;

public class ClienteDeCorreo {
	private Carpeta inbox;
	private ArrayList<Carpeta> carpetas;
	
	public ClienteDeCorreo() {
		Carpeta inbox = new Carpeta("inbox");
		this.carpetas=new ArrayList<Carpeta>();
		this.carpetas.add(inbox);
	}
	
	public void recibir(Email email) {
		this.inbox.agregarEmail(email);
	}
	
	public Email buscar(String texto) {
		return this.carpetas.stream().map(b -> b.buscarEmail(texto)).findFirst().orElse(null);
		
	}
	
	public int espacioOcupado() {
		return this.carpetas.stream().mapToInt(a -> a.getlongitud()).sum();
	}
}
