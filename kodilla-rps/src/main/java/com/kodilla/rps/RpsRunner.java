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

    public void introduction() {
        System.out.println("Starting rock-paper-scissors game!");
        System.out.print("Enter your name: ");
        userName = myObj.nextLine();  // Read user input
        System.out.println("Username: " + userName);  // Output user input
        System.out.print("Enter number of rounds: ");

        try {
            numberOfRounds = Integer.parseInt(myObj.nextLine());  // Read user input
        } catch (NumberFormatException  e) {
            System.out.println("Incorrect value! Default value: 3.");
        }

        System.out.println("Number of rounds is: " + numberOfRounds);  // Output user input
        System.out.println();
        System.out.println("Instructions:");
        System.out.println("Press 1 for rock.");
        System.out.println("Press 2 for paper.");
        System.out.println("Press 3 for scissors.");
        System.out.println("Press x to quit the game.");
        System.out.println("Press s to start the game from the beginning.");
        System.out.println();
        round = 1;
        playerScore = 0;
        computerScore = 0;
        game();
    }

    public void game() {
        while (round <= numberOfRounds) {
            System.out.println("///////////////////////////////////////////////////////////////////////////");
            System.out.println("Round " + round);
            System.out.print("Select your move: ");
            String playerMove = myObj.nextLine();

            if ("1".equals(playerMove)) {
                playerMoveDescription = "rock";
            } else if ("2".equals(playerMove)) {
                playerMoveDescription = "paper";
            } else if ("3".equals(playerMove)) {
                playerMoveDescription = "scissors";
            } else if ("x".equals(playerMove)) {
                System.out.print("Are you sure you want to finish the game? Press y for yes, n for no: ");
                String playerDecision = myObj.nextLine();
                if ("y".equals(playerDecision)) {
                    System.out.println("Closing the game.");
                    System.exit(0);
                } else if ("n".equals(playerDecision)) {
                    game();
                }
            } else if ("s".equals(playerMove)) {
                System.out.print("Are you sure you want to start a new game? Press y for yes, n for no: ");
                String playerDecision = myObj.nextLine();
                if ("y".equals(playerDecision)) {
                    introduction();
                } else if ("n".equals(playerDecision)) {
                    game();
                }
            } else {
                System.out.println("Incorrect move, try again!");
                game();
            }

            System.out.println("Your move is: " + playerMoveDescription);
            if (playerMove.equals(1)) {
                System.out.println("There is a draw!");
            }

            Random theGenerator = new Random();
            int computerMove = theGenerator.nextInt(3) + 1;

            switch (computerMove) {
                case 1: //rock
                    System.out.println("Computer move is: rock.");
                    if ("1".equals(playerMove)) {
                        System.out.println("There is a draw!");
                        playerScore = playerScore + 1;
                        computerScore = computerScore + 1;
                    }
                    if ("2".equals(playerMove)) {
                        System.out.println("Paper beats rock, you won!");
                        playerScore = playerScore + 1;
                    }
                    if ("3".equals(playerMove)) {
                        System.out.println("Rock beats scissors, you lost!");
                        computerScore = computerScore + 1;
                    }
                    break;
                case 2: //paper
                    System.out.println("Computer move is: paper.");
                    if ("1".equals(playerMove)) {
                        System.out.println("Paper beats rock, you lost!");
                        computerScore = computerScore + 1;
                    }
                    if ("2".equals(playerMove)) {
                        System.out.println("There is a draw!");
                        playerScore = playerScore + 1;
                        computerScore = computerScore + 1;
                    }
                    if ("3".equals(playerMove)) {
                        System.out.println("Scissors beats paper, you win!");
                        playerScore = playerScore + 1;
                    }
                    break;
                    case 3: //scissors
                    System.out.println("Computer move is: scissors.");
                    if ("1".equals(playerMove)) {
                        System.out.println("Rock beats scissors, you win!");
                        playerScore = playerScore + 1;
                    }
                    if ("2".equals(playerMove)) {
                        System.out.println("Scissors beats paper, you lost!");
                        computerScore = computerScore + 1;
                    }
                    if ("3".equals(playerMove)) {
                        System.out.println("There is a draw!");
                        playerScore = playerScore + 1;
                        computerScore = computerScore + 1;
                    }
                    break;
            }

            System.out.println("Round " + round + " score: " + userName + ": " + playerScore + " ,computer: " + computerScore);
            round = round + 1;
        }
        endGame();
    }

    public void endGame() {
        System.out.println();
        System.out.println("///////////////////////////////////////////////////////////////////////////");
        System.out.println("End of the game.");
        System.out.print(userName + " score: " + playerScore + ", computer score: " + computerScore);
        if (playerScore > computerScore) {
            System.out.println(". You win!");
        } else if (playerScore < computerScore) {
            System.out.println(" You lost!");
        } else {
            System.out.println(" There is a draw!");
        }
        System.out.println("///////////////////////////////////////////////////////////////////////////");
        System.out.print("Press x to end the game, press s to start a new game: ");

        String playerDecision = myObj.nextLine();
        if ("x".equals(playerDecision)) {
            System.out.println("Closing the game.");
            System.exit(0);
        } else if ("s".equals(playerDecision)) {
            introduction();
        }
    }


    public static void main(String[] args) {
        RpsRunner start = new RpsRunner();
        start.introduction();
        //start.game();
        //start.endGame();
    }
}
