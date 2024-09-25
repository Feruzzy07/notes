
/**
 * Write a description of class blackjack here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class blackjack
{
    public static void main(){
        Scanner scanner = new Scanner(System.in);
        Hand myhand = new Hand(false);
        Hand dealershand = new Hand(false);
        
        System.out.println("Dealers first card is " + dealershand.getCard());
        System.out.println("My hand is " + myhand.theTotal());
        
        System.out.println("Would you like to hit or stand?");
    

        while(myhand.getBust() == false && myhand.theTotal() < 21){
            System.out.println("1 for hit, 2 for stand");
            int choice = scanner.nextInt();
            int card = (int)(Math.random()*9 + 1);
            if(choice == 1){
                myhand.setTotal(myhand.theTotal() + card);
            
                System.out.println("You pulled a " + card);
                System.out.println("Your hand total is now " + myhand.theTotal());
                if(myhand.theTotal() > 21){
                    myhand.setBust(true);
                    System.out.println("You bust, so you lost :(");
                }
            }else{
                System.out.println("The Dealers second card was " + dealershand.getCard2());
                System.out.println("That brings the dealers total to " + dealershand.theTotal());
                while(dealershand.getBust() == false && dealershand.theTotal() <= 16){
                    int dealersCard = (int)(Math.random()*9 + 1);
                    System.out.println("the dealer pulls a " + dealersCard);
                    
                    dealershand.setTotal(dealershand.theTotal() + dealersCard);
                    
                    System.out.println("the dealer hand is now " + dealershand.theTotal());
                    
                }
            }
        }
        if(myhand.theTotal() == dealershand.theTotal()){
            System.out.println("Nobody won :/");
        }else if(myhand.theTotal() > dealershand.theTotal()){
            System.out.println("Yay you beat the dealer :)");
        }else{
            System.out.println("You lost, the dealer beat you");
        }
        
    }
}
