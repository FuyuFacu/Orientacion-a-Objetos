package io.github.unlp_oo.Ejercicio13;

public class Archivo {
	private String nombre;
	
	public Archivo(String n) {this.nombre=n;}
	
	public int tamaño() {
		return nombre.length();
	}
}
