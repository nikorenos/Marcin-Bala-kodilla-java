package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testPizzaWithFluffyPan() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new FluffyPanPizzaDecorator(pizzaOrder);
        //When
        BigDecimal calculatedCost = pizzaOrder.getCost();
        //Then
        assertEquals(new BigDecimal(20), calculatedCost);
    }

        @Test
        public void testPizzaWithFluffyPanDescription() {
                //Given
                PizzaOrder pizzaOrder = new BasicPizzaOrder();
                pizzaOrder = new FluffyPanPizzaDecorator(pizzaOrder);
                //When
                String description = pizzaOrder.getDescription();
                //Then
                assertEquals("Pizza with fluffy pan", description);
        }
}
