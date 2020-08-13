package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component//tworzy beana
public class Calculator {

    @Autowired//pobierz po typie
    private Display display;

    public double add (double a, double b) {
        display.displayValue(a + b);
        return a + b;
    }
    public double sub (double a, double b) {
        display.displayValue(a - b);
        return a - b;
    }
    public double mul (double a, double b) {
        display.displayValue(a * b);
        return a * b;
    }
    public double div (double a, double b) {
        if (b == 0) {
            display.displayValue(0);
            return 0;
        }
        display.displayValue(a / b);
        return a / b;
    }


    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        double a = 2.0;
        double b = 5.0;

        calculator.add(a,b);
    }
}
