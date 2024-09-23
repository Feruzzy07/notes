
/**
 * Write a description of class taxcalc here.
 *
 * @author Fernando Ortega
 * @version 8.30.24
 */
import java.util.Scanner;
public class taxcalc
{
    public static void main(String[] args){
        Scanner scanner;
        scanner= new Scanner(System.in);
        
        System.out.println("What's your gross income");
        double gross = scanner.nextDouble();
        
        System.out.println("how many dependants do you have?");
        int dependant = scanner.nextInt();
        
        double agi = gross - 10000;
        agi = agi - (2000*dependant);
        
        double moneyowed = agi * 0.20;
        
        System.out.println("You owe the governemnt $" + moneyowed + "! >:)");
        
    }
    //need to know $ total
    // num of dependats
    //math
    //print back how much money you owe
    
}
