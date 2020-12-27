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
                assertEquals("Pizza on fluffy pan", description);
    }

    @Test
    public void testPizzaWithLightPanDoubleBaconAndPaprika() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new LightPanPizzaDecorator(pizzaOrder);
        pizzaOrder = new BaconIngredientPizzaDecorator(pizzaOrder);
        pizzaOrder = new BaconIngredientPizzaDecorator(pizzaOrder);
        pizzaOrder = new PaprikaIngredientPizzaDecorator(pizzaOrder);
        //When
        BigDecimal calculatedCost = pizzaOrder.getCost();
        //Then
        assertEquals(new BigDecimal(22), calculatedCost);
    }

    @Test
    public void testPizzaWithLightPanDoubleBaconAndPaprikaDescription() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new LightPanPizzaDecorator(pizzaOrder);
        pizzaOrder = new BaconIngredientPizzaDecorator(pizzaOrder);
        pizzaOrder = new BaconIngredientPizzaDecorator(pizzaOrder);
        pizzaOrder = new PaprikaIngredientPizzaDecorator(pizzaOrder);
        //When
        String description = pizzaOrder.getDescription();
        //Then
        assertEquals("Pizza on light pan + bacon + bacon + paprika", description);
    }
}
