
/**
 * Write a description of class basicJava here.
 *
 * @author Fernando Ortega
 * @version 8.26.24
 */
public class BasigJava{
    public static void dataTypes(){
        //PRIMITIVE DATA TYPES
        
        //True and false
        boolean a; //Decleration (It tells the computer what it will be, and allocates memory
        a = false; //Instatiation( a is assigned to false
        
        //Numbers
        int b;
        b = 12; //This is the most common whole number. We use integers.
        b = -49; //the 12 that it was no longer exists.
        
        //Less known numbers
        //   ** means you dont need to know it for ap test
        
        long c = 10000000; //** max is 2^63 - 1
        //int //max is 2^31 - 1 or aprox 2.1B
        short e = 1888; //** 2^15 - 1
        byte f = 127; //** Can be up to 127(or 2^7-1)
        
        //Decimals
        double h = 2.2354; //2^64 
        float i = 2.2f; //** 2^32
        
        //Words
        char j = 't'; //**
        
        //Not primitive
        String k = "hello"; //This acts like a primitive, but isn't
        //String m = new String("hello"); 
        String m;
        m = new String("hello");
        
        if (2 > 1){
            String n = "this variable doesn't exist very long";
            System.out.println(m);
        }
        //System.out.println(n);
    }
}
