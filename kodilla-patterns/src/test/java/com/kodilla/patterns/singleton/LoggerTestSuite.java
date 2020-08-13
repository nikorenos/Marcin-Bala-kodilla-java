package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {
    @BeforeClass
    public static void createLog() {
                  Logger.getInstance().log("first log");
    }

    @Test
    public void testGetLastLog() {
        //Given
        //When
        String getLastLog = Logger.getInstance().getLastLog();
        //Then
        Assert.assertEquals("first log", getLastLog);
    }
}
