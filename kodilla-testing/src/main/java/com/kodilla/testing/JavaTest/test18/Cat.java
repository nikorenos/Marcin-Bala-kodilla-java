package com.kodilla.testing.JavaTest.test18;

abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name=name;
    }

    public String getName() {
        return name;
    }
}

class Cat extends Animal {
    private int numberOfLegs;

	public Cat(String name, int numberOfLegs) {
        super(name);
        this.numberOfLegs = numberOfLegs;
    }
}
