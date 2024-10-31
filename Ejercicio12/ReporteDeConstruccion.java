package ar.edu.unlp.info.oo1.ejercicio12;
import java.util.ArrayList;
import java.util.List;


public class ReporteDeConstruccion {
	private List<Pieza> listaPiezas;

	public ReporteDeConstruccion() {listaPiezas = new ArrayList<>();}
	
	public void agregarPieza(Pieza P) {
		if (P != null) listaPiezas.add(P);
		
	}
	
	public double volumenDeMaterial(String Material) {
		return this.listaPiezas.stream()
				.filter(m -> m.getMaterial()
				.equals(Material))
				.mapToDouble(Pieza::getVolumen)
				.sum();
	}
	
	public double superficieDeColor(String color) {
		return this.listaPiezas.stream()
				.filter(c -> c.getColor()
				.equals(color))
				.mapToDouble(Pieza::getSuperficie)
				.sum();
	}

	public List<Pieza> getListaPiezas() {
		return listaPiezas;
	}

	
	
	
	
}
