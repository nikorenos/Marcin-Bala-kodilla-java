package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.OptionalDouble;

import static com.kodilla.stream.array.ArrayOperations.getAverage;
import static org.junit.Assert.assertEquals;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage() {
        //Given
        int[] marks = {5,5,5,4,4,4};
        int[] marksEmpty = {};

        //When
        double average = getAverage(marks);
        double averageZero = getAverage(marksEmpty);

        //Then
        double expectedAverage = 4.5;
        double expectedAverageZero = 0.0;
        assertEquals(expectedAverage, average, 0.001);
        assertEquals(expectedAverageZero, averageZero, 0.001);
    }

}
