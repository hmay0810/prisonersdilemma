
/**
 * this is my game of "Prisoners Dilemma"
 * CSC223 Wellington Highschool
 * Hannah Newman
 * 3/07/24
 */
import java.util.Scanner;
public class game
{
        public game()
    {
       
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("welcome to the prisoners dilemma!");
        
        System.out.print("enter the number of rounds");
        int rounds = keyboard.nextInt();
        System.out.println("we shall play " + rounds + " rounds");
        
        //storing the players scores
        int[] player1Score = new int[rounds];
        int[] player2Score = new int[rounds];
        
        
        //declaring the round number
        for (int round = 0; round < rounds; round++);
            System.out.println("round " + (rounds - rounds + 1));
        
        //player 1 decision 
        System.out.println("player 1 choose your move: press 1 to cooperate, 2 to betray");
        int player1Move = keyboard.nextInt();
        while (player1Move != 1 && player1Move != 2) { //if they dont answer 1 or 2
            System.out.println("please give a valid answer.");
            System.out.println("player 1 choose your move: press 1 to cooperate, 2 to betray");
        }
        
        //player 2 decision 
        System.out.println("player 2 choose your move: press 1 to cooperate, 2 to betray");
        int player2Move = keyboard.nextInt();
        while (player2Move != 1 && player2Move != 2) { //if they dont answer 1 or 2
            System.out.println("please give a valid answer.");
            System.out.println("player 1 choose your move: press 1 to cooperate, 2 to betray");
        }
        
        //points for each move 
        if(player1Move == 1 && player2Move == 1) {
            player1Score[rounds] = 1;
            player2Score[rounds] = 1;
            System.out.println("the players cooperated with eachother - 1 year added to both their sentences");
            } else if (player1Move == 1 && player2Move == 2){
                player1Score[rounds] = 4;
                player2Score[rounds] = 0;
                System.out.println("player 1 cooperated while player 2 betrayed - 4 years added to player 1's setence, none to player 2's");
            } else if (player1Move == 2 && player2Move == 1){
                player1Score[rounds] = 0;
                player2Score[rounds] = 4;
                System.out.println("player 2 cooperated while player 1 betrayed - 4 years added to player 2's setence, none to player 1's");
            } else if (player1Move == 2 && player2Move == 2){
                player1Score[rounds] = 3;
                player2Score[rounds] = 3;
                System.out.println("both players betrayed - 3 years added to each sentence");
            }
        }  
            
    }
