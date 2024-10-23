package ar.edu.unlp.info.oo1.ej10_jobScheduler;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JobSchedulerTest {
    protected JobGeneral firstJob;
    protected JobGeneral highestPriorityJob;
    protected JobGeneral mostEffortJob;
    protected JobGeneral lastJob;

    private void initializeJobs() {

        firstJob = new FIFO (1, 1, "Este es el primero");
        highestPriorityJob = new HighestPriority (1, 100, "Este es el de más prioridad");
        mostEffortJob = new MostEffort (100, 1, "Este es el de más esfuerzo");
        lastJob = new LIFO (1, 1, "Este es el último");
    }

    @BeforeEach
    void setUp() {
        this.initializeJobs();
    }

    private JobScheduler newFifoScheduler() {
        JobScheduler fifoScheduler = new JobScheduler();
        fifoScheduler.setStrategy(firstJob);
        return fifoScheduler;
    }

    private JobScheduler newLifoScheduler() {
        JobScheduler lifoScheduler = new JobScheduler();
        lifoScheduler.setStrategy(lastJob);
        return lifoScheduler;
    }

    private JobScheduler newPriorityScheduler() {
        JobScheduler priorityScheduler = new JobScheduler();
        priorityScheduler.setStrategy(highestPriorityJob);
        return priorityScheduler;
    }

    private JobScheduler newEffortScheduler() {
        JobScheduler effortScheduler = new JobScheduler();
        effortScheduler.setStrategy(mostEffortJob);
        return effortScheduler;
    }

    private void scheduleJobsIn(JobScheduler aJobScheduler) {
        aJobScheduler.schedule(firstJob);
        aJobScheduler.schedule(highestPriorityJob);
        aJobScheduler.schedule(mostEffortJob);
        aJobScheduler.schedule(lastJob);
    }

    @Test
    void testSchedule() {
        JobScheduler aScheduler = new JobScheduler();
        aScheduler.schedule(highestPriorityJob);
        assertTrue(aScheduler.getJobs().contains(highestPriorityJob));
    }

    @Test
    void testUnschedule() {
        JobScheduler aScheduler = new JobScheduler();
        this.scheduleJobsIn(aScheduler);
        aScheduler.unschedule(highestPriorityJob);
        assertFalse(aScheduler.getJobs().contains(highestPriorityJob));
    }

    @Test
    void testNext() {
        JobScheduler scheduler;

        scheduler = this.newFifoScheduler();
        this.scheduleJobsIn(scheduler);
        assertEquals(scheduler.next(), firstJob);
        assertEquals(scheduler.getJobs().size(), 3);

        scheduler = this.newLifoScheduler();
        this.scheduleJobsIn(scheduler);
        assertEquals(scheduler.next(), lastJob);
        assertEquals(scheduler.getJobs().size(), 3);

        scheduler = this.newPriorityScheduler();
        this.scheduleJobsIn(scheduler);
        assertEquals(scheduler.next(), highestPriorityJob);
        assertEquals(scheduler.getJobs().size(), 3);

        scheduler = this.newEffortScheduler();
        this.scheduleJobsIn(scheduler);
        assertEquals(scheduler.next(), mostEffortJob);
        assertEquals(scheduler.getJobs().size(), 3);
    }
}
