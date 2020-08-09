package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testAddDisplay() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        double a = 8.0;
        double b = 5.0;
        //When
        Double score = calculator.add(a,b);
        //Then
        Assert.assertEquals(13.0, score, 0.001);
    }
    @Test
    public void testSubDisplay() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        double a = 8.0;
        double b = 5.0;
        //When
        Double score = calculator.sub(a,b);
        //Then
        Assert.assertEquals(3.0, score, 0.001);
    }

    @Test
    public void testMulDisplay() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        double a = 8.0;
        double b = 5.0;
        //When
        Double score = calculator.mul(a,b);
        //Then
        Assert.assertEquals(40.0, score, 0.001);
    }

    @Test
    public void testDivDisplay() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        double a = 8.0;
        double b = 4.0;
        //When
        Double score = calculator.div(a,b);
        //Then
        Assert.assertEquals(2.0, score, 0.001);
    }
}