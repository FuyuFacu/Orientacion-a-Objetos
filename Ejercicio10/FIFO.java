package ar.edu.unlp.info.oo1.ej10_jobScheduler;

import java.util.List;

public class FIFO extends JobGeneral{

	public FIFO(double effort, int priority, String description) {
		super(effort, priority, description);
	}

	public JobGeneral proximoTrabajo(List<JobGeneral> Scheduler) {
		JobGeneral Resultado = Scheduler.get(0);
		Scheduler.remove(0);
		return Resultado;
	}
}


