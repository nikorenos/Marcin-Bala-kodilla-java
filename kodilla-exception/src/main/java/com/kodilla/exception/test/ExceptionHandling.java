package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String[] args) throws Exception
    {

        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            String result = secondChallenge.probablyIWillThrowException(3.0, 0.0);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("There is an exception!");
        } finally {
            System.out.println("Try of throw exception.");
        }

    }


}
