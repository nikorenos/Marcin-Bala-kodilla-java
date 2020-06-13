package com.kodilla.testing.shape;

import java.util.ArrayList;
import org.junit.*;

public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    //test 1
    @Test
    public void testAddFigure() {
        //Given
        Shape shape1 = new Circle();
        ArrayList<Shape> list1 = new ArrayList<Shape>();
        ShapeCollector collection1 = new ShapeCollector();

        //When
        collection1.addFigure(shape1);

        //Then
        Assert.assertEquals(1, collection1.getListSize());
    }

    //test 2
    @Test
    public void testRemoveFigure() {
        //Given
        Shape shape1 = new Circle();
        ArrayList<Shape> list1 = new ArrayList<Shape>();
        ShapeCollector collection1 = new ShapeCollector();
        collection1.addFigure(shape1);

        //When
        collection1.removeFigure(shape1);

        //Then
        Assert.assertEquals(0, collection1.getListSize());
    }

    //test 3
    @Test
    public void testGetFigure() {
        //Given
        Shape shape1 = new Circle();
        ArrayList<Shape> list1 = new ArrayList<Shape>();
        list1.add(shape1);
        ShapeCollector collection1 = new ShapeCollector();
        collection1.addFigure(shape1);

        //When
        Shape retrievedFigure;
        retrievedFigure = collection1.getFigure(0);

        //Then
        Assert.assertEquals(list1.get(0), retrievedFigure);
    }

    //test 4
    @Test
    public void testGetFigureBelowZero() {
        //Given
        Shape shape1 = new Circle();
        ShapeCollector collection1 = new ShapeCollector();
        collection1.addFigure(shape1);

        //When
        Shape retrievedFigure;
        retrievedFigure = collection1.getFigure(-1);

        //Then
        Assert.assertEquals(null, retrievedFigure);
    }

    //test 5
    @Test
    public void testGetFigureOutOfRange() {
        //Given
        Shape shape1 = new Circle();
        Shape shape2 = new Square();
        ShapeCollector collection1 = new ShapeCollector();
        collection1.addFigure(shape1);
        collection1.addFigure(shape2);

        //When
        Shape retrievedFigure;
        retrievedFigure = collection1.getFigure(10);

        //Then
        Assert.assertEquals(null, retrievedFigure);
    }

    //test 6
    @Test
    public void testShowFigures() {
        //Given
        Shape shape1 = new Circle();
        Shape shape2 = new Triangle();
        Shape shape3 = new Square();
        ArrayList<Shape> list1 = new ArrayList<Shape>();
        list1.add(shape1);
        list1.add(shape2);
        list1.add(shape3);
        ShapeCollector collection1 = new ShapeCollector();
        collection1.addFigure(shape1);
        collection1.addFigure(shape2);
        collection1.addFigure(shape3);

        //When
        ArrayList<Shape> retrievedList = collection1.showFigures();

        //Then
        Assert.assertEquals(list1, retrievedList);
    }

}
