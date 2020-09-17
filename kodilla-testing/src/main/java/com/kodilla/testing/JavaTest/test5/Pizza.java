package com.kodilla.testing.JavaTest.test5;

import java.util.ArrayList;
import java.util.List;

public final class Pizza {
    private List<String> ingredients;

    public static class PizzaBuilder {
        private List<String> ingredients = new ArrayList<>();

        public PizzaBuilder ingredient(String ingredient) {
            ingredients.add(ingredient);
            return this;
        }

        public Pizza build() {
            return new Pizza(ingredients);
        }
    }

    private Pizza(List<String> ingredients) {

        this.ingredients = new ArrayList<>(ingredients);
    }

    public List<String> getIngredients() {
        return ingredients;
    }

}
