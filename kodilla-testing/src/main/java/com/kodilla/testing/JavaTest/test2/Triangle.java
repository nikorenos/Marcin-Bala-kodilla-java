package com.kodilla.testing.JavaTest.test2;


interface Shape {
    default void draw() {
        System.out.println("drawing any shape");
    }

    default void paint() {
        System.out.println("Painting in progress");
    }
}

class Triangle implements Shape {
    public void changeSize() {
        System.out.println("Scaling in progress");
    }

    public static void main(String[] args) {
        Shape triangle = new Triangle();
        triangle.draw();
        //Shape.();
    }
}
