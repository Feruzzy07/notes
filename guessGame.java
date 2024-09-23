/**
 * Write a description of class guessGame here.
 *
 * @author Fernando Ortega
 * @version 9.9.2024
 */
import java.util.Scanner;
public class guessGame
{
    /**
     * 
     * Create a game that generates a secret random number between 1 and 100;
     * The player then guesses a number. If it is correct, the game is over. If not,
     * the computer says "Higher" or "Lower".
     * 
     * The player has up to 5 guesses to get the number
     * 
     * You will need if-statements, a for/while loop(we will get to these friday)
     */
    public static void guessGame(){
        Scanner scanner = new Scanner(System.in);
        int randomNum = (int)(Math.random()*100 + 1);//Generates a random number between 1-100
        
        System.out.println("Guess a number between 1-100?");

        for (int i = 5; i > 0; i--){
            int guess = scanner.nextInt();
            if(randomNum > guess){
                System.out.println("Try Higher");
            } else if(guess > randomNum){
                System.out.println("Try Lower");
            } else{
                System.out.println("Yay you guessed it! :)");
                return;
            }
        }
        System.out.println("Sorry you ran out of tries! :(");
        System.out.println("The number was " + randomNum);
        return;
    }
    
    public static void blah(){
        boolean thing = true;
        int i = 1;
        while(i <= 5){
            int e;
            for(e = 0; e < 5; e++){
                System.out.print(i);

            }
            System.out.println();
            i++;
            e = 0;
                
        }


        }
    }
