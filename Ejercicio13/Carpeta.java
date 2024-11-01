package io.github.unlp_oo.Ejercicio13;

import java.util.ArrayList;
import java.util.List;

public class Carpeta {
	String nombre;
	List<Email> emails;
	
	public Carpeta(String nombre) {
		this.emails = new ArrayList<Email>();
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void agregarEmail(Email e) {
		emails.add(e);
	}
	
	public void mover(Email email, Carpeta carpeta) {
		carpeta.agregarEmail(email);
		this.emails.remove(email);
	}
	
	public Email buscarEmail(String texto) {
		Email buscado = this.emails.stream()
				.filter(e -> e.getTitulo().equals(texto) || e.getCuerpo().equals(texto))
				.findFirst()
				.orElse(null);
		return buscado;
	}
	
	public int getlongitud() {
		return this.emails.size();
		
	}
	
}
