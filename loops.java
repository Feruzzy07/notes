
/**
 * Write a description of class loops here.
 *
 * @author Fernando Ortega
 * @version 9.9.24
 */
public class loops{
    //For Loops
    public static void mystery(){
        for(int i = 0; i < 10; i++){
            System.out.println("The cake is a lie...");
        }
        for(int i = 0; i < 10; i++){
            System.out.println(i);
        }
        System.out.println();
        //Change this to print the numbers 5 through 30(inclusive)
        for(int i = 5; i <= 30; i++){
            System.out.println(i);
        }
    }
    
    /*
    public static void mystery2(){
        //DO NOT RUN THIS!!!!!
        int i = 0;
        while(true){
            System.out.println("MY subcriber count: " + i);
            i++;
        }
    }
    */
   
    public static void myster3(){
        int i = 1000;
        while(i>=0){
            System.out.println("Wiebes subscriber count: " + i);
            i--;
        }
    }
    
    public static void mystery4(){
        int i = 0;
        int j = 10;
        while(i<10 && j >=4){
            System.out.println("The number i is: " + i);
            System.out.println("Then number j is : " + j);
            i++;
            j--;
        }
        
    }
    
    public static void mystery5(){
        boolean thing = true;
        int i = 0;
        while(thing){
            System.out.println(i);
            if (i > 10){
                thing = false;
            }
            i++;
        }
    }
}


