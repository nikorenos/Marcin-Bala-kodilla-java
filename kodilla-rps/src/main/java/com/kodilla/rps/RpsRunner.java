package com.kodilla.rps;

import java.util.*;

public class RpsRunner {

    public void startGame () {
        int round = 0;

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


        while (round < numberOfRounds) {
            System.out.println("Round#" + round);

            System.out.println("Select your move:");
            String playerMove = myObj.nextLine();
            System.out.println("Your choice is :" + playerMove);
            if (playerMove.equals(1)) {
                System.out.println("There is a draw!");
            }

            Random theGenerator = new Random();
            int computerMove = theGenerator.nextInt(3);

            switch (computerMove) {
                case 0: //rock
                    System.out.println("Computer move is: rock.");
                    if (playerMove.equals("1")) {
                        System.out.println("There is a draw!");
                    }
                    if (playerMove.equals("2")) {
                        System.out.println("Paper beats rock, you won!");
                    }
                    if (playerMove.equals("3")) {
                        System.out.println("Rock beats scissors, you lost!");
                    }
                    break;
                case 1: //paper
                    System.out.println("Computer move is: paper.");
                    if (playerMove.equals("1")) {
                        System.out.println("Paper beats rock, you lost!");
                    }
                    if (playerMove.equals("2")) {
                        System.out.println("There is a draw!");
                    }
                    if (playerMove.equals("3")) {
                        System.out.println("Scissors beats paper, you win!");
                    }
                    break;
                    case 2: //scissors
                    System.out.println("Computer move is: scissors.");
                    if (playerMove.equals("1")) {
                        System.out.println("Rock beats scissors, you win!");
                    }
                    if (playerMove.equals("2")) {
                        System.out.println("Scissors beats paper, you lost!");
                    }
                    if (playerMove.equals("3")) {
                        System.out.println("There is a draw!");
                    }
                    break;

            }

        }
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
