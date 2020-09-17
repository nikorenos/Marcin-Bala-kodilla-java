package com.kodilla.testing.JavaTest.test15;

interface Driveable {
    void drive();
}

interface Vehicle extends Driveable {
    void speedUp(int speed);
}

class Car implements Vehicle {
    private int speed = 0;

    @Override
    public void drive() {
        System.out.println("I'm driving");
    }

    @Override
    public void speedUp(int speed) {
        this.speed = speed;
        System.out.println("Speed: " + speed);
    }
}
