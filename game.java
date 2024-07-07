
/**
 * this is my game of "Prisoners Dilemma"
 * CSC223 Wellington Highschool
 * Hannah Newman
 * 3/07/24
 */
import java.util.Scanner;
public class game
{
        
    {
        
        Scanner keyboard = new Scanner(System.in);
        
        //intro
        System.out.println("welcome to the prisoners dilemma!");
        System.out.println("you and your criminal comrade have been caught in the act! you are now facing trial for your alleged crimes.");
        System.out.println("if player 1 stays silent but player 2 testifies, 4 years will be added to players 1's sentence, none added to player 2's");
        System.out.println("if player 2 stays silent but player 1 testifies, 4 years will be added to players 2's sentence, none added to player 1's");
        System.out.println("if both players stay silent, 1 year will be added to both their sentences");
        System.out.println("if both players testify, 3 years will be added to both their sentences");
        System.out.println("the player with the loswet sentence wins");
        
        //getting the number of rounds
        System.out.print("enter the number of rounds you want to play");
        while (!keyboard.hasNextInt()) { //if a number isnt entered
            System.out.println("please enter a valid number.");
            keyboard.next(); 
            System.out.print("enter the number of rounds you want to play ");
        }
        int rounds = keyboard.nextInt();
        System.out.println("we shall play " + rounds + " rounds");
        

        //storing the players scores
        int[] player1Score = new int[rounds];
        int[] player2Score = new int[rounds];
        
        
        //declaring the round number
        for (int round = 0; round < rounds; round++) {
            System.out.println("round " + (round + 1));
        
        //player 1 decision 
        System.out.println("player 1 choose your move: press 1 to cooperate, 2 to betray");
        int player1Move = keyboard.nextInt();
        while (player1Move != 1 && player1Move != 2) { //if they dont answer 1 or 2
            System.out.println("please give a valid answer.");
            System.out.println("round " + (round + 1) + " - player 1 choose your move: press 1 to cooperate, 2 to betray");
            player1Move = keyboard.nextInt();        
        }
        
        //player 2 decision 
        System.out.println("player 2 choose your move: press 1 to cooperate, 2 to betray");
        int player2Move = keyboard.nextInt();
        while (player2Move != 1 && player2Move != 2) { //if they dont answer 1 or 2
            System.out.println("please give a valid answer.");
            System.out.println("round " + (round + 1) + " - player 1 choose your move: press 1 to cooperate, 2 to betray");
            player2Move = keyboard.nextInt();    
        }
        
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
            } else {
                round--;
                continue;
            }
            
            System.out.println("scores for round " + (round + 1) + " - player 1: " + player1Score[round] + " - player 2: " + player2Score[round]);
        }
        //calculating final scores
        int totalPlayer1Score = 0;
        int totalPlayer2Score = 0;
        for (int i = 0; i < rounds; i++) {
             totalPlayer1Score += player1Score[i];
             totalPlayer1Score += player2Score[i];
        }
         
        //declaring the winner
        System.out.println("final scores! player 1: " + totalPlayer1Score + " - player 2: " + totalPlayer2Score);
        if (totalPlayer1Score < totalPlayer2Score) {
            System.out.println("player 1 wins with the lowest sentence!");
        }else if (totalPlayer1Score > totalPlayer2Score) {
            System.out.println("player 2 wins with the lowest sentence!");
        }else {
            System.out.println("its a tie!");
        }
        
        keyboard.close();
    }
    
}

    
        
            
        
            
    
