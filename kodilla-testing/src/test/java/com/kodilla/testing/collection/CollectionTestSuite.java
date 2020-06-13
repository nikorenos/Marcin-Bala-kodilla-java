package com.kodilla.testing.collection;
import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;

import java.util.ArrayList;

public class CollectionTestSuite {
    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList(){

        ArrayList<Integer> example1 = new ArrayList<Integer>();

        //Given
        ArrayList<Integer> numbers1 = new ArrayList<Integer>();
        numbers1.add(1);
        numbers1.add(5);
        OddNumbersExterminator test = new OddNumbersExterminator();

        //When
        ArrayList<Integer> retrievedList = test.exterminate(numbers1);
        System.out.println("Testing " + example1 + " + " + numbers1);
        //Then
        Assert.assertEquals(example1, retrievedList);
    }
    @Test
    public void testOddNumbersExterminatorNormalList(){

        ArrayList<Integer> example2 = new ArrayList<Integer>();
        example2.add(8);
        example2.add(18);

        //Given
        ArrayList<Integer> numbers2 = new ArrayList<Integer>();
        numbers2.add(7);
        numbers2.add(8);
        numbers2.add(13);
        numbers2.add(18);
        OddNumbersExterminator test = new OddNumbersExterminator();

        //When
        ArrayList<Integer> retrievedList = test.exterminate(numbers2);
        System.out.println("Testing " + example2 + " + " + numbers2);
        //Then
        Assert.assertEquals(example2, retrievedList);
    }
}