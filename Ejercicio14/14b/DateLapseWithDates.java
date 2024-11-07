package ar.edu.unlp.info.oo1.ejercicio14;
import java.time.LocalDate;

public class DateLapseWithDates implements DateLapse {
    private LocalDate from;
    private int sizeInDays;


    public DateLapseWithDates(LocalDate from, int sizeInDays) {
		super();
		this.from = from;
		this.sizeInDays = sizeInDays;
	}


	public LocalDate getFrom() 
	{
		return this.from;
	}
	
	public LocalDate getTo()
	{
		return this.from.plusDays(sizeInDays);
	}
	
	public int sizeInDays()
	{
		return sizeInDays;
	}
	
	public boolean includesDate(LocalDate L) 
	{
		return (!L.isBefore(this.from) && !L.isAfter(this.getTo()));
	}
	
}
