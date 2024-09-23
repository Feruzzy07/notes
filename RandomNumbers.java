
/**
 * Write a description of class RandomNumbers here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RandomNumbers
{
    /** will print a random number between 1 and 10
     * 
     */
    public static void main(){
        double num = Math.random();
        int randomNum = (int)(Math.random()*10 + 1); //Generates a number from 1 to 10
        System.out.println(num);
    }
    
    public static int oneToFive(){
        int num = (int)(Math.random()*5 + 1);// Generates a number from 1 to 10
        return num;
    }
    
    public static int threeToTen(){
        //THIS IS WRONG
        int num = (int)(Math.random()*8 - 3);// 8 for the # of options,
        //3 for where you want it to start ^^^^
        return num;
    }
}
