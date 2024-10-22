package ar.edu.unlp.info.oo1.ejercicio6;

import java.time.LocalDate;

public class Mamifero {
	private String Identificador;
	private String Especie;
	private LocalDate FechaNacimiento;
	private Mamifero Padre;
	private Mamifero Madre;
	
	
	public Mamifero() {}
	
	
	public Mamifero(String Identificador) {
		this.Identificador = Identificador;
	}


	public String getIdentificador() {
		return Identificador;
	}


	public void setIdentificador(String identificador) {
		Identificador = identificador;
	}


	public String getEspecie() {
		return Especie;
	}


	public void setEspecie(String especie) {
		Especie = especie;
	}


	public LocalDate getFechaNacimiento() {
		return FechaNacimiento;
	}


	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		FechaNacimiento = fechaNacimiento;
	}


	public Mamifero getPadre() {
		return Padre;
	}


	public void setPadre(Mamifero padre) {
		Padre = padre;
	}


	public Mamifero getMadre() {
		return Madre;
	}


	public void setMadre(Mamifero madre) {
		Madre = madre;
	}
	
	public Mamifero getAbueloMaterno() {
		return (this.Madre != null && this.Madre.getPadre() != null) ? this.Madre.getPadre() : null;
	}
	
	public Mamifero getAbueloPaterno() {
		return (this.Padre != null && this.Padre.getPadre() != null) ? this.Padre.getPadre() : null;
	}
	
	public Mamifero getAbuelaMaterna() {
		return (this.Madre != null && this.Madre.getMadre() != null) ? this.Madre.getMadre() : null;
	}
	public Mamifero getAbuelaPaterna() {
		return (this.Padre != null && this.Padre.getMadre() != null) ? this.Padre.getMadre() : null;
	}
	
	public boolean tieneComoAncestroA(Mamifero unMamifero) {
		if (unMamifero == null) return false;
		
		if (this.Padre == unMamifero || this.Madre == unMamifero) return true;
		
		return (this.Padre != null && this.Padre.tieneComoAncestroA(unMamifero) || 
				this.Madre != null && this.Madre.tieneComoAncestroA(unMamifero));
		
	}
	
	
	
	
	
}
