package ar.edu.unlp.info.oo1.ejercicio14;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateLapse {
	private LocalDate from;
	private LocalDate to;
	
	public DateLapse(LocalDate from, LocalDate to) 
	{
		this.from = from;
		this.to = to;
	}


	public LocalDate getFrom() 
	{
		return this.from;
	}

	
	public LocalDate getTo() 
	{
		return this.to;
	}
	
	public int sizeInDays() 
	{
		long cantDias = this.from.until(this.to, ChronoUnit.DAYS);
		return (int) cantDias;
	}
	
	public boolean includesDate(LocalDate other) 
	{
		return (other.isAfter(this.from) || other.isEqual(this.from)) && 
				(other.isBefore(this.to) || (other.isEqual(to))) ;
	}
}
