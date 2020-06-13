package com.kodilla.testing.shape;

import java.util.ArrayList;

interface Shape {
    String getShapeName();
    Double getField();
}

class Square implements Shape {
    String name = "Square";
    Double field = 100.0;

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public Double getField() {
        return field;
    }

    @Override
    public String toString(){
        return name + " " + field;
    }
}
class Triangle implements Shape {
    String name = "Triangle";
    Double field = 50.0;

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public Double getField() {
        return field;
    }

    @Override
    public String toString(){
        return name + " " + field;
    }
}
class Circle implements Shape {
    String name = "Circle";
    Double field = 20.0;

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public Double getField() {
        return field;
    }

    @Override
    public String toString(){
        return name + " " + field;
    }

}

public class ShapeCollector {

    private Shape shape;
    private ArrayList<Shape> list = new ArrayList<Shape>();

    public void addFigure(Shape shape){
        list.add(shape);
    }

    public boolean removeFigure(Shape shape){
        boolean result = false;
        if (list.contains(shape)){
            list.remove(shape);
            result = true;
        }
        return result;
    }

    //displays figure from collection from n list position
    public Shape getFigure(int n) {
        if (n < 0) {
            return null;
        } else if (n > list.size()-1) {
            return null;
        } else {
            return list.get(n);
        }
    }

    //shows all figures in collection
    public ArrayList<Shape> showFigures() {
        //System.out.println("Collection contains:");
        //for (Shape shape : list) {
            //shape.getShapeName();
            //System.out.println("Shape: " + shape.getShapeName() + " Field: " + shape.getField());
        //}
        return list;
    }

    public int getListSize(){
        return list.size();
    }


    public static void main(String[] args){

        Shape shape1 = new Circle();
        Shape shape2 = new Square();
        Shape shape3 = new Triangle();
        ArrayList<Shape> list1 = new ArrayList<Shape>();
        ShapeCollector collection1 = new ShapeCollector();
        collection1.addFigure(shape1);
        collection1.addFigure(shape2);
        collection1.addFigure(shape3);
        //collection1.removeFigure(shape2);

        System.out.println("Element in collection: " + collection1.getFigure(-1));
        System.out.println("Element in collection: " + collection1.getFigure(2));
        System.out.println("Element in collection: " + collection1.getFigure(10));
        System.out.println("Collection: " + collection1.showFigures());
        System.out.println("Number of shapes in collection: " + collection1.getListSize());

    }

}

