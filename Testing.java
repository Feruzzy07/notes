
/**
 * Write a description of class TestPrint here.               
 *
 * @author Fernando Ortega
 * @version 8.27.24
 */
import java.util.Scanner;
public class Testing{//class name cant start with name or symbol
    public static void main(String[] args){
        int a; //Decleration of a
        Scanner scanner;//Decleraion of scanner
        scanner = new Scanner(System.in);//Instantiation of scanner(assigning) 
        
        System.out.println("Hello! What is your name?");
        String name;
        name = scanner.next();
        
        System.out.println("Hello " + name + ".");//Concatenation of the three string
        
        System.out.println("What is your favorite color");
        String color = scanner.next();
        System.out.println(color + " is a really cool color");
        
        System.out.println("How old are you?");
        int age = scanner.nextInt();
        System.out.println(age + "!? woww, you belong in a museum.");
        int newAge = age + 1;
        System.out.println("Next year, you will be " + newAge + " years old");
        
    }
}