package ar.edu.unlp.info.oo1.ejercicio20;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class Empleado {
	private String nombre;
	private String apellido;
	private int CUIL;
	private LocalDate fechaNacimiento;
	private boolean HijosACargo;
	private List<Contrato> contratos;
	
	public Empleado(String nombre, String apellido, int cUIL, LocalDate fechaNacimiento, boolean hijosACargo) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		CUIL = cUIL;
		this.fechaNacimiento = fechaNacimiento;
		HijosACargo = hijosACargo;
		this.contratos = new ArrayList<>();
	}


	public void agregarContrato(Contrato C)
	{
		if (!this.contratos.stream().anyMatch(c -> c.esActivo()))
		{
			this.contratos.add(C);
		}
	}
	
	public Contrato getContratoVigente()
	{
		return this.contratos.stream()
				.filter(c -> c.esActivo())
				.findFirst()
				.orElse(null);
	}
	
	
	public Recibo generarRecibo()
	{
		Contrato c = getContratoVigente();
		long antiguedad = ChronoUnit.YEARS.between(c.getInicio(), LocalDate.now());
		double sueldoBasico = c.calcularMonto();
		
	    if (antiguedad >= 20) {
	        sueldoBasico *= 2;
	    } else if (antiguedad >= 15) {
	        sueldoBasico *= 1.7;
	    } else if (antiguedad >= 10) {
	        sueldoBasico *= 1.5;
	    } else if (antiguedad >= 5) {
	        sueldoBasico *= 1.3;
	    }
	    
		return new Recibo(nombre, apellido, CUIL, (int)antiguedad, sueldoBasico);
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public int getCUIL() {
		return CUIL;
	}


	public void setCUIL(int cUIL) {
		CUIL = cUIL;
	}


	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}


	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}


	public boolean isHijosACargo() {
		return HijosACargo;
	}


	public void setHijosACargo(boolean hijosACargo) {
		HijosACargo = hijosACargo;
	}


	public List<Contrato> getContratos() {
		return contratos;
	}


	public void setContratos(List<Contrato> contratos) {
		this.contratos = contratos;
	}
	
	
}
