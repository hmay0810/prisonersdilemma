/**
 * this is my game of "Prisoners Dilemma"
 * CSC223 Wellington Highschool
 * Hannah Newman
 * 27/07/24
 * IP: everything in my game is orginal and not owned under any copyright
 * Social: the lanuage in this game is resricted to avoid offensive language 
 * Usability: no coloured pictures or sound as been added to make this game usable for everyone
 */
import java.util.Scanner;
public class game
{
        
    {
        //setting up the scanner 
        Scanner keyboard = new Scanner(System.in);
        
        //intro
        System.out.println("welcome to the prisoners dilemma!");
        System.out.println("you and your criminal comrade have been caught in the act! you are now facing trial for your alleged crimes. \n");
        System.out.println("if player 1 stays silent but player 2 testifies, 4 years will be added to players 1's sentence, none added to player 2's");
        System.out.println("if player 2 stays silent but player 1 testifies, 4 years will be added to players 2's sentence, none added to player 1's");
        System.out.println("if both players stay silent, 1 year will be added to both their sentences");
        System.out.println("if both players testify, 3 years will be added to both their sentences \n");
        System.out.println("the player with the loswet sentence wins!");
        
        //getting the number of rounds
        int rounds = getValidNumberOfRounds(keyboard);
        System.out.println("we shall play " + rounds + " rounds");

        //storing the players scores
        int[] player1Score = new int[rounds];
        int[] player2Score = new int[rounds];
        
        //declaring the round number
        for (int round = 0; round < rounds; round++) {
            System.out.println("\nround " + (round + 1));
        
        int player1Move = getPlayerMove(keyboard, 1, round);
        int player2Move = getPlayerMove(keyboard, 2, round);
        
        //points for each move 
        if(player1Move == 1 && player2Move == 1) {
            player1Score[round] = 1;
            player2Score[round] = 1;
            System.out.println("the players cooperated with eachother - 1 year added to both their sentences");
            } else if (player1Move == 1 && player2Move == 2){
                player1Score[round] = 4;
                player2Score[round] = 0;
                System.out.println("player 1 cooperated while player 2 betrayed - 4 years added to player 1's setence, none to player 2's");
            } else if (player1Move == 2 && player2Move == 1){
                player1Score[round] = 0;
                player2Score[round] = 4;
                System.out.println("player 2 cooperated while player 1 betrayed - 4 years added to player 2's setence, none to player 1's");
            } else if (player1Move == 2 && player2Move == 2){
                player1Score[round] = 3;
                player2Score[round] = 3;
                System.out.println("both players betrayed - 3 years added to each sentence");
            } 
            
            System.out.println("scores for round " + (round + 1) + " - player 1: " + player1Score[round] + " - player 2: " + player2Score[round]);
        }
        //calculating final scores
        int totalPlayer1Score = 0;
        int totalPlayer2Score = 0;
        for (int i = 0; i < rounds; i++) {
             totalPlayer1Score += player1Score[i];
             totalPlayer2Score += player2Score[i];
        }
         
        //declaring the winner
        System.out.println("\nfinal scores! player 1: " + totalPlayer1Score + " - player 2: " + totalPlayer2Score);
        if (totalPlayer1Score < totalPlayer2Score) {
            System.out.println("player 1 wins with the lowest sentence!");
        }else if (totalPlayer1Score > totalPlayer2Score) {
            System.out.println("player 2 wins with the lowest sentence!");
        }else {
            System.out.println("its a tie!");
        }
        
        keyboard.close();
    }

    //the function for asking and sotring the ammount of rounds
    int getValidNumberOfRounds(Scanner keyboard) {
        System.out.print("enter the number of rounds you want to play: ");
        while (!keyboard.hasNextInt()) {
            System.out.println("please enter 1 or 2");
            keyboard.next(); // clearing the invalid input
            System.out.print("Enter the number of rounds you want to play: ");
        }
        int rounds = keyboard.nextInt();
        return rounds;
    }
    
    //the function for asking and scoring the player's move
    int getPlayerMove(Scanner keyboard, int playerNumber, int round) {
        System.out.println("player " + playerNumber + " choose your move: press 1 to cooperate, 2 to betray");
        while (true) {
            if (keyboard.hasNextInt()) {
                int move = keyboard.nextInt();
                if (move == 1 || move == 2) {
                    return move;
                }
            } else {
                keyboard.next(); // clearing the invalid input
            }
            System.out.println("please enter 1 or 2.");
            System.out.println("round " + (round + 1) + " - player " + playerNumber + " choose your move: press 1 to cooperate, 2 to betray");
        }
    }
    
}



    
        
            
        
            
    
