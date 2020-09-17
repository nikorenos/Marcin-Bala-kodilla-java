package com.kodilla.testing.JavaTest.test11;

import org.junit.Assert;
import org.junit.Test;

class Calculator {
    public long add(long a, long b) {
        return a + b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            return 0;
        }
        return a/b;
    }
}

class CalculatorTestSuite {

    @Test
    public void testAdd() {
        //given
        Calculator calculator = new Calculator();
        //when
        long result = calculator.add(123L, 234);
        //then
        Assert.assertEquals(357, result);
    }
}	
