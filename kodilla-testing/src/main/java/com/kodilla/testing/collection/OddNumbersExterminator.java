package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {

    ArrayList<Integer> evenNumbers  = new ArrayList<Integer>();

    public void exterminate(ArrayList<Integer> numbers) {

        for(Integer number: numbers){
            if(number % 2 == 0){
                evenNumbers.add(number);
                //System.out.println(number);
            };
        }
    }

    public ArrayList<Integer> getEvenNumbers(){
        return evenNumbers;
    }
}
