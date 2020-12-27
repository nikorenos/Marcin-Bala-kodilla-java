package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class LightPanPizzaDecorator extends AbstractPizzaOrderDecorator {
    public LightPanPizzaDecorator (PizzaOrder pizzaOrder) {
        super (pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        //hardcoded stub cost = 4        }
        return super.getCost().add(new BigDecimal(4));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " light pan";
    }
}