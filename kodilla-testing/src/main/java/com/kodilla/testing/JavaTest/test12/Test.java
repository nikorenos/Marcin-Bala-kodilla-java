package com.kodilla.testing.JavaTest.test12;

public class Test {
    public static void main(String[] args) {
        Animal smallAnimal = new Cat("Tigger");
        System.out.println(smallAnimal.getName()); //powinno wyświetlić się "Tigger"
    }
}


abstract class Animal {
    public String name;

    public String getName() {
        return name;
    }
}

class Cat extends Animal {

    public Cat(String name) {
        this.name = name;
    }
}
