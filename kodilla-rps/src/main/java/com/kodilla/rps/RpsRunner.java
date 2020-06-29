package com.kodilla.rps;

import java.util.*;

public class RpsRunner {

    public void startGame () {

        System.out.println("Starting rock-paper-scissors game!");

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter your name:");

        String userName = myObj.nextLine();  // Read user input
        System.out.println("Username is: " + userName);  // Output user input

        System.out.println("Enter number of rounds:");

        int numberOfRounds = myObj.nextInt();  // Read user input
        System.out.println("Number of rounds is: " + numberOfRounds);  // Output user input

        System.out.println();
        System.out.println("Instructions:");
        System.out.println("Press 1 for rock.");
        System.out.println("Press 2 for paper.");
        System.out.println("Press 3 for scissors.");
        System.out.println("Press x to quit the game.");
        System.out.println("Press n to start the game from the beginning.");

    }




    public static void main(String[] args) {

        RpsRunner start = new RpsRunner();
        start.startGame();

        /*System.out.println("Starting rock-paper-scissors game!");

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter your name:");

        String userName = myObj.nextLine();  // Read user input
        System.out.println("Username is: " + userName);  // Output user input

        System.out.println("Enter number of rounds:");

        int numberOfRounds = myObj.nextInt();  // Read user input
        System.out.println("Number of rounds is: " + numberOfRounds);  // Output user input*/
    }
}
