package ar.edu.unlp.info.oo1.ej10_jobScheduler;

import java.util.List;

public class LIFO extends JobGeneral {
	
	
	
	public LIFO(double effort, int priority, String description) {
		super(effort, priority, description);
	}

	public JobGeneral proximoTrabajo(List<JobGeneral> Scheduler) {
		JobGeneral Resultado = Scheduler.get(Scheduler.size()-1);
		Scheduler.remove(Resultado);
		return Resultado;
	}
	
	
	
}
