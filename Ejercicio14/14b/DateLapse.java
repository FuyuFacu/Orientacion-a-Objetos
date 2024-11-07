package ar.edu.unlp.info.oo1.ejercicio14;

import java.time.LocalDate;

public interface DateLapse {
	public LocalDate getTo();
	
	public LocalDate getFrom();
	
	public int sizeInDays();
	
	public boolean includesDate(LocalDate L);
}
