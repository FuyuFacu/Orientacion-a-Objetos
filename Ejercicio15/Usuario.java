package ar.edu.unlp.info.oo1.ejercicio15;
import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private String nombre;
	private String domicilio;
	private List<Consumo> consumos;
	private CuadroTarifario cuadroTarifario;
	//
	
	
	public Usuario(String nombre, String domicilio, CuadroTarifario C) {
		super();
		this.nombre = nombre;
		this.domicilio = domicilio;
		this.consumos = new ArrayList<>();
		this.cuadroTarifario = C;
	}
	

	
	public void agregarConsumo(Consumo C)
	{
		this.consumos.add(C);
	}
	
	public Consumo getUltimoConsumo()
	{
		if (!consumos.isEmpty())
		{
			return consumos.get(consumos.size() - 1);
		}
		return null;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public double getPrecio() {
		return this.cuadroTarifario.getPrecioKWH();
	}
	
	
	
}
