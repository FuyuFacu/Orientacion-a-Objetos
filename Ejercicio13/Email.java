package io.github.unlp_oo.Ejercicio13;

import java.util.ArrayList;
import java.util.List;

public class Email {
	List<Archivo> archivos;
	String cuerpo;
	String titulo;
	
	public Email(String cuerpo, String titulo) {
		this.cuerpo=cuerpo;
		this.titulo=titulo;
		this.archivos= new ArrayList<Archivo>();
	}
		
	public String getCuerpo() {
		return cuerpo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void addArchivo(Archivo a) {
		archivos.add(a);
	}
	
	public List<Archivo> adjuntos() {
		return archivos.stream().toList();
	}
	
	public int tamaño() {
		int tamañoarchivos = archivos.stream().mapToInt(a -> a.tamaño()).sum();
		int tamañocuerpo = getCuerpo().length();
		int tamañotitulo = getTitulo().length();
		return tamañoarchivos + tamañocuerpo + tamañotitulo;
	}
}
