package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TaskQueueTestSuite {
    @Test
    public void testTasksUpdate() {
        //Given
        TaskQueue taskQueue1 = new TaskQueue("User 1");;
        TaskQueue taskQueue2 = new TaskQueue("User 2");;
        TaskQueue taskQueue3 = new TaskQueue("User 3");;
        Mentor steveJobs = new Mentor("Steve", "Jobs");
        Mentor billGates = new Mentor("Bill", "Gates");
        taskQueue1.registerObserver(steveJobs);
        taskQueue2.registerObserver(billGates);
        taskQueue3.registerObserver(steveJobs);

        //When
        taskQueue1.addTask("Facade");
        taskQueue1.addTask("Decorator");
        taskQueue2.addTask("Singleton");
        taskQueue2.addTask("Prototype");
        taskQueue2.addTask("Strategy");
        taskQueue2.addTask("Factory");
        taskQueue3.addTask("Inversion of Control");

        //Then
        assertEquals(3, steveJobs.getUpdateCount());
        assertEquals(4, billGates.getUpdateCount());
    }
}
