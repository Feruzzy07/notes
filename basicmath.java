
/**
 * Write a description of class basicmath here.
 *
 * @author Fernando Ortega
 * @version 8.28.24
**/
public class basicmath
{
    public static void main(){
        int a = 5;
        int b = 6;
        int c = 2;
        double f = 2.2;
        
        //Addition 
        int e = a + b;
        System.out.println(e);//Will be 11
        System.out.println(a + b);//Will also be 11
        
        //Subtraction
        System.out.println(b-a);//Will be 1
        
        //Multiplication
        System.out.println(a * b);//will be 30
        
        //Division****(BE CAREFUL!!!!)
        System.out.println(b/c); //Will be 3
        System.out.println(a/c); //2, should be 2.5
        System.out.println(6/5); //1, should be 1.2
        System.out.println(99/100); //0, should be 0.99
        //NOTE: int divided by int is ALWAYS an int. Any decimals are cut off
        
        System.out.println(5.0/2); //2.5
        System.out.println(6/2.); //3.0
        
        //Recasing
        System.out.println(a/c); // I want 2.5. How do I ix it?
        System.out.println((double)a/c); //I get 2.5
        
        System.out.println((double)(a/c)); //What does this do? Why?
        //^^^^^ it seperates the double from a/c
        
        //What does this symbol do?
        System.out.println(6 % 5); //1 
        System.out.println(3 % 2); //1 
        System.out.println(11 % 5); //1
        System.out.println(12 % 4); //0
        System.out.println(5 % 3); //2
        //It gives the remainder
        //said as ex: 6 mod 5 (mod = modulus)

        
        
        
        
    }
}