package ar.edu.unlp.info.oo1.ej10_jobScheduler;

import java.util.List;

public abstract class JobGeneral {
	private double effort;
	private int priority;
	private String description;
	
	

	public JobGeneral(double effort, int priority, String description) {
		super();
		this.effort = effort;
		this.priority = priority;
		this.description = description;
	}

	public double getEffort() {
		return effort;
	}

	public void setEffort(double effort) {
		this.effort = effort;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	public abstract JobGeneral proximoTrabajo(List<JobGeneral> metodo);
	
	
}
