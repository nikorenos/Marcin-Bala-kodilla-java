package com.kodilla.testing.collection;

import com.kodilla.testing.shape.*;

import java.util.ArrayList;

public class OddNumbersExterminator {

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
        ArrayList<Integer> evenNumbers = new ArrayList<>();

        for(Integer number: numbers){
            if(number % 2 == 0) {
                evenNumbers.add(number);
            }
        }
        return evenNumbers;
    }

    public static void main(String[] args){

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(7);
        numbers.add(8);
        numbers.add(13);
        numbers.add(18);
        OddNumbersExterminator test = new OddNumbersExterminator();


        System.out.println("Element in collection: " + test.exterminate(numbers));


    }

}
