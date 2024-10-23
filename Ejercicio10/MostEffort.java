package ar.edu.unlp.info.oo1.ej10_jobScheduler;

import java.util.List;

public class MostEffort extends JobGeneral{
	
	
	
	
	public MostEffort(double effort, int priority, String description) {
		super(effort, priority, description);
	}

	public JobGeneral proximoTrabajo(List<JobGeneral> Scheduler) {
		JobGeneral Resultado = Scheduler.stream().max((j1,j2) -> Double.compare(j1.getEffort(), j2.getEffort())).orElse(null);
		Scheduler.remove(Resultado);
		return Resultado;
	}
}
