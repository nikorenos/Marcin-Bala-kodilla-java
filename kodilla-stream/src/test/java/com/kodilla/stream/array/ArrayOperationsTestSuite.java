package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.OptionalDouble;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage() {
        //Given
        int[] marks = {5,5,5,4,4,4};

        //When
        OptionalDouble average = ArrayOperations.getAverage(marks);

        //Then
        OptionalDouble expectedAverage = OptionalDouble.of(4.5);
        Assert.assertEquals(expectedAverage, average);
    }

}
