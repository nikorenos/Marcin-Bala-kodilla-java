package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryCircle() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task drivingTask = taskFactory.doTask(TaskFactory.DRIVINGTASK);
        //Then
        Assert.assertEquals("Pizza delivery", drivingTask.getTaskName());
    }
}
