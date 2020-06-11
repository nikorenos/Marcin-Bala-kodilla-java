package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.*;

public class TestingMain {
    public static void main(String[] args){

        int a = 10;
        int b = 5;

        Calculator add1 = new Calculator(a,b);

        int result1 = add1.add();
        int result2 = add1.subtract();

        if (result1 == a + b){
            System.out.println("Add test OK");
        } else {
            System.out.println("Add error!");
        }

        if (result2 == a - b){
            System.out.println("Subtract test OK");
        } else {
            System.out.println("Subtract error!");
        }





        /*
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

         */

    }
}