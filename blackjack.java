
/**
 * Write a description of class blackjack here.
 *
 * @author Fernando Ortega
 * @version (9.30.24)
 */
import java.util.Scanner;
public class blackjack
{
    public static void main(){
        Scanner scanner = new Scanner(System.in);
        Hand myhand = new Hand();
        Hand dealershand = new Hand();
        boolean playerTurn = true;

        System.out.println("------BlackJack------");
        System.out.println("Dealers first card is " + dealershand.getCard1());
        System.out.println("My hand is " + myhand.theTotal());

        System.out.println("Would you like to hit or stand?");

        //Phase 1 - Player's turn
        while(!myhand.getBust() && myhand.theTotal() < 21 && playerTurn){
            System.out.println("1 for hit, 2 for stand");
            System.out.println("-------------------------------------------------");
            int choice = scanner.nextInt();
            if(choice == 1){
                System.out.println("You pulled a " + myhand.getCard());
                System.out.println("Your hand total is now " + myhand.theTotal());
                System.out.println("-------------------------------------------------");
                if(myhand.getBust()){
                    System.out.println("You bust, so you lost :(");
                    return;
                }
            }else{
                playerTurn = false;
            }
        }

        //Dealer's Turn
        System.out.println("The Dealers second card was " + dealershand.getCard2());
        System.out.println("That brings the dealers total to " + dealershand.theTotal());
        while(!dealershand.getBust() && dealershand.theTotal() <= 16){
            System.out.println("-----------");
            System.out.println("the dealer pulls a " + dealershand.getCard());
            System.out.println("the dealer hand is now " + dealershand.theTotal());
            if(dealershand.getBust()){
                System.out.println("-----------");
                System.out.println("You win because the dealer bust");
                return;
            }
        }

        //Who wins?
        if(myhand.theTotal() == dealershand.theTotal()){
            System.out.println("-----------");
            System.out.println("Nobody won :/");
        }else if(myhand.theTotal() > dealershand.theTotal()){
            System.out.println("-----------");
            System.out.println("Yay you beat the dealer :)");
        }else{
            System.out.println("-----------");
            System.out.println("You lost, the dealer beat you :(");
        }
    }
}
