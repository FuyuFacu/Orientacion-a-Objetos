package ar.edu.unlp.info.oo1.ej10_jobScheduler;

import java.util.ArrayList;
import java.util.List;

public class JobScheduler {
    protected List<JobGeneral> jobs;
    private JobGeneral strategy;

    public JobScheduler () {
        this.jobs = new ArrayList<>();
    }

    public void schedule(JobGeneral job) {
        this.jobs.add(job);
    }

    public void unschedule(JobGeneral job) {
        if (job != null) {
            this.jobs.remove(job);
        }
    }

    public JobGeneral getStrategy() {
        return this.strategy; 
    }

    public List<JobGeneral> getJobs(){
        return jobs;
    }

    public void setStrategy(JobGeneral eStrategy) {
        this.strategy = eStrategy;
    }

    public JobGeneral next() {
    	JobGeneral nextJob = strategy.proximoTrabajo(jobs); //Me voy a quedar pelado por culpa de este ejercicio
        if (nextJob == null) {System.out.println("No quedan trabajos disponibles let's gooooo");}
    	return nextJob;
    }

}
