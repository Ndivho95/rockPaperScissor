//package com.company;

import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        String playerOneWeaponName = "", playerTwoWeaponName = "";
        int playerOneWeaponNumber = 0, playerTwoWeaponNumber = 0, playerOneScore = 0, playerTwoScore = 0;
        System.out.println("Input Meaning \n1\t\trock\n2\t\tpaper\n3\t\tscissors\n4\t\tquit");

            do {

                System.out.println("Player One: Choose your weapon!");
                playerOneWeaponNumber = Integer.parseInt(in.next());
                if(playerOneWeaponNumber < 4){
                    switch (playerOneWeaponNumber) {
                        case 1:
                            playerOneWeaponName = "rock";
                            System.out.println("Good choice!");
                            break;
                        case 2:
                            playerOneWeaponName = "paper";
                            System.out.println("Good choice!");
                            break;
                        case 3:
                            playerOneWeaponName = "scissor";
                            System.out.println("Good choice!");
                            break;
                        default:
                    }
                }else{
                    break;
                }

                System.out.println("Player Two: Choose your weapon!");
                playerTwoWeaponNumber = Integer.parseInt(in.next());

                if(playerTwoWeaponNumber < 4){
                    switch (playerTwoWeaponNumber) {
                        case 1:
                            playerTwoWeaponName = "rock";
                            System.out.println("Good choice!");
                            break;
                        case 2:
                            playerTwoWeaponName = "paper";
                            System.out.println("Good choice!");
                            break;
                        case 3:
                            playerTwoWeaponName = "scissor";
                            System.out.println("Good choice!");
                            break;
                        default:
                    }
                }else{
                    break;
                }

                System.out.println(String.format("Player One chose: %s", playerOneWeaponName));
                System.out.println(String.format("Player Two chose: %s", playerTwoWeaponName));

                //check for rock vs paper
                if(playerOneWeaponName.equals("rock") && playerTwoWeaponName.equals("paper")){
                    // check for rock vs paper
                    System.out.println("Player Two Wins!");
                    playerTwoScore++;
                }else if(playerOneWeaponName.equals("paper") && playerTwoWeaponName.equals("rock")){
                    System.out.println("Player One Wins!");
                    playerOneScore++;
                }
                //check for rock vs scissor
                else if(playerOneWeaponName.equals("rock") && (playerTwoWeaponName.equals("scissor"))){
                    // check for rock vs scissor
                    System.out.println("Player One Wins!");
                    playerOneScore++;
                }else if(playerOneWeaponName.equals("scissor") && (playerTwoWeaponName.equals("rock"))){
                    // check for rock vs scissor
                    System.out.println("Player Two Wins!");
                    playerTwoScore++;
                }
                // check for paper vs scissor
                else if(playerOneWeaponName.equals("paper") && (playerTwoWeaponName.equals("scissor"))){
                    System.out.println("Player Two Wins!");
                    playerTwoScore++;
                }else if(playerOneWeaponName.equals("scissor") && (playerTwoWeaponName.equals("paper"))){
                    System.out.println("Player One Wins!");
                    playerOneScore++;
                }
                // handling all the draws
                else if(playerOneWeaponName.equals("paper") && (playerTwoWeaponName.equals("paper"))){
                    System.out.println("It's a draw!");
                }
                else if(playerOneWeaponName.equals("scissor") && (playerTwoWeaponName.equals("scissor"))){
                    System.out.println("It's a draw!");
                }
                else if(playerOneWeaponName.equals("rock") && (playerTwoWeaponName.equals("rock"))){
                    // check for rock vs scissor
                    System.out.println("It's a draw!");
                }

                // show each player's score
                System.out.println(String.format("The score is now: %s - %s", playerOneScore, playerTwoScore));




            } while ((playerOneWeaponNumber < 4) && (playerTwoWeaponNumber < 4));

        // check who won, else print out the tie message
        if(playerOneScore > playerTwoScore){
            System.out.println(String.format("The winner is Player One with %s points.", (playerOneScore - playerTwoScore)));
        }else if(playerTwoScore > playerOneScore){
            System.out.println(String.format("The winner is Player Two with %s points.", (playerTwoScore - playerOneScore)));
        }else{
            System.out.println(String.format("Player One and Player Two are tied with %s points.", (playerOneScore)));
        }
        System.out.println("Quitting");
    }
}
