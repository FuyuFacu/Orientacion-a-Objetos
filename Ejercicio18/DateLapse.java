package ar.edu.unlp.info.oo1.ejercicio17;

import java.time.LocalDate;

public class DateLapse {
	private LocalDate from;
	private LocalDate to;
	
	
	public DateLapse(LocalDate from, LocalDate to) {
		super();
		this.from = from;
		this.to = to;
	}
	
	public long getDays()
	{
		return java.time.temporal.ChronoUnit.DAYS.between(from, to);
	}
	
	
	public boolean superpone(DateLapse otraFecha) {
	    return this.from.isBefore(otraFecha.getTo()) && this.to.isAfter(otraFecha.getFrom());
	}


	public LocalDate getFrom() {
		return from;
	}


	public void setFrom(LocalDate from) {
		this.from = from;
	}


	public LocalDate getTo() {
		return to;
	}


	public void setTo(LocalDate to) {
		this.to = to;
	}
	
	
	
	
	
}
