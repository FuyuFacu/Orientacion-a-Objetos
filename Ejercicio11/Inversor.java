package ar.edu.unlp.info.oo1.ejercicio11;
import java.util.ArrayList;
import java.util.List;


public class Inversor {
	private String nombre;
	private List<InversionTipo> inversiones = new ArrayList<>();
	
	public Inversor(String nombre) {
		this.nombre = nombre;
	}
	
	public void agregarInversion(InversionTipo I) {
		this.inversiones.add(I);
	}
	
	public double InversionTotal() {
		return (this.inversiones.stream().mapToDouble(InversionTipo::valorActual).sum());
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<InversionTipo> getInversiones() {
		return inversiones;
	}

	public void setInversiones(List<InversionTipo> inversiones) {
		this.inversiones = inversiones;
	}
	
	
	
}
