package com.kodilla.rps;

import java.util.*;

public class RpsRunner {
    String userName;
    int round = 1;
    int numberOfRounds = 3;
    int playerScore = 0;
    int computerScore = 0;
    String playerMoveDescription;
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object

    public void introduction () {
        System.out.println("Starting rock-paper-scissors game!");

        System.out.print("Enter your name: ");

        userName = myObj.nextLine();  // Read user input
        System.out.println("Username: " + userName);  // Output user input

        System.out.print("Enter number of rounds: ");

        numberOfRounds = Integer.parseInt(myObj.nextLine());  // Read user input
        System.out.println("Number of rounds is: " + numberOfRounds);  // Output user input
        System.out.println();
        System.out.println("Instructions:");
        System.out.println("Press 1 for rock.");
        System.out.println("Press 2 for paper.");
        System.out.println("Press 3 for scissors.");
        System.out.println("Press x to quit the game.");
        System.out.println("Press n to start the game from the beginning.");
        System.out.println();
        game();
    }

    public void game () {
        while (round <= numberOfRounds) {
            System.out.println("///////////////////////////////////////////////////////////////////////////");
            System.out.println("Round " + round);
            System.out.print("Select your move: ");
            String playerMove = myObj.nextLine();
            if (playerMove.equals("1")) {
                playerMoveDescription = "rock";
            }
            if (playerMove.equals("2")) {
                playerMoveDescription = "paper";
            }
            if (playerMove.equals("3")) {
                playerMoveDescription = "scissors";
            }

            System.out.println("Your move is: " + playerMoveDescription);
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
                        playerScore = playerScore + 1;
                        computerScore = computerScore + 1;
                    }
                    if (playerMove.equals("2")) {
                        System.out.println("Paper beats rock, you won!");
                        playerScore = playerScore + 1;
                    }
                    if (playerMove.equals("3")) {
                        System.out.println("Rock beats scissors, you lost!");
                        computerScore = computerScore + 1;
                    }
                    break;
                case 1: //paper
                    System.out.println("Computer move is: paper.");
                    if (playerMove.equals("1")) {
                        System.out.println("Paper beats rock, you lost!");
                        computerScore = computerScore + 1;
                    }
                    if (playerMove.equals("2")) {
                        System.out.println("There is a draw!");
                        playerScore = playerScore + 1;
                        computerScore = computerScore + 1;
                    }
                    if (playerMove.equals("3")) {
                        System.out.println("Scissors beats paper, you win!");
                        playerScore = playerScore + 1;
                    }
                    break;
                    case 2: //scissors
                    System.out.println("Computer move is: scissors.");
                    if (playerMove.equals("1")) {
                        System.out.println("Rock beats scissors, you win!");
                        playerScore = playerScore + 1;
                    }
                    if (playerMove.equals("2")) {
                        System.out.println("Scissors beats paper, you lost!");
                        computerScore = computerScore + 1;
                    }
                    if (playerMove.equals("3")) {
                        System.out.println("There is a draw!");
                        playerScore = playerScore + 1;
                        computerScore = computerScore + 1;
                    }
                    break;
            }

            System.out.println("Round " + round + " score: you: " + playerScore + " ,computer: " + computerScore);
            round = round + 1;
        }
        endGame();
    }

    public void endGame() {
        System.out.println();
        System.out.println("End of the game.");
        System.out.print("Your score: " + playerScore + ", computer score: " + computerScore);
        if (playerScore > computerScore) {
            System.out.println(". You win!");
        } else if (playerScore < computerScore) {
            System.out.println(" You lost!");
        } else {
            System.out.println(" There is a draw!");
        }
        System.out.println("Press x to end the game, press n to start a new game:");
    }


    public static void main(String[] args) {
        RpsRunner start = new RpsRunner();
        start.introduction();
        //start.game();
        //start.endGame();
    }
}
