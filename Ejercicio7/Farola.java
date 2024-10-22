package ar.edu.unlp.info.oo1.ejercicio7;
import java.util.ArrayList;
import java.util.List;

public class Farola {
	private boolean interruptor;
	private List<Farola> conexiones;
	
	public Farola() {
		this.interruptor = false;
		this.conexiones = new ArrayList<>(); 
	}
	
	public void agregarVecino(Farola F) {
		if (!getNeighbors().contains(F)) {
			conexiones.add(F);
		}
	}
	
	public void pairWithNeighbor(Farola F) {
		this.agregarVecino(F);
		F.conexiones.add(this); // se agrega la reciprocidad
	}
	
	
	public List<Farola> getNeighbors() {
		return conexiones;
	}
	
	public void turnOff() {
		if (isOn()) {
			interruptor = false;
			conexiones.stream().forEach(Farola::turnOff);
		}
	};
	// Enciendo la actual, filtro , y en cada objeto implemento la funcion de manera recursiva, para que recorra 
	// sus vecinos dicha farola
	public void turnOn() {
		if (isOff()) {
			interruptor = true;
			conexiones.stream().forEach(Farola::turnOn);
		}
	} 
	// Apago el actual, filtro , y en cada objeto implemento la funcion de manera recursiva, para que recorra sus vecinos dicha farola
	
	public boolean isOn() {return this.interruptor;}  // chequeo si esta encendido, me retorna true si es verdadero
	public boolean isOff() {return !this.interruptor;} // chequeo si esta apagado, me retorna true si es verdadero
	
}
