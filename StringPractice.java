
/**
 * Write a description of class StringPractice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner; 
public class StringPractice{

    public static void main(){
        String sentence = "The quick brown fox jumps over the lazy dog";
        String word = new String("Bird");
        
        System.out.println("Zoo".length());
        System.out.println(word.length());
        System.out.println(sentence.length());//lengths start counting at 1

        System.out.println();
        System.out.println();
        
        String newString = sentence.substring(4,9);
        System.out.println(newString);
        String randomStuff = "qwertyuiopasdfghjklzxcvbnm";
        System.out.println(randomStuff.substring(1, 3));//index start counting at 0
        //Up to but not including 3,  ^^^^^^^^ 
        
        //Get the word "Brown"(substring)
        System.out.println(sentence.substring(10, 15));//starts index 10 up to 15(10-14)
        
        System.out.println(sentence.substring(16));//starts index at 16 to end
        System.out.println(sentence.substring(16, sentence.length()));// ^^^ same as statement above
        
        //IndexOF
        int location = sentence.indexOf("lazy");//Finds the location of the word "lazy"
        System.out.println(location);
        
        int location2 = sentence.indexOf("Dog");//There is no "Dog", so its -1
        System.out.println(location2);
        
        int location3 = sentence.indexOf("o");//Finds first instance of "o"
        System.out.println(location3);
        
        int location4 = sentence.indexOf("o", 14); //looks for the first instance of "o" on or past index 14
        System.out.println(location4);
        
        // .equals
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.next();
        if(answer.equals(word)){//
            System.out.println("You said the word: Bird");
        }else{
            System.out.println("You didnt say \"Bird\".");// \" means i want this quotation there
            //Please include the " marking in the string(its not the end of the string)^^ its an escape key
        }
        
        ///CompareTo
        int number = "this".compareTo("other");//positive if "other" comes before
        System.out.println(number);
        number = "word".compareTo("word");// 0 if same
        System.out.println(number);
        number = "word1".compareTo("word2");//negative 
        System.out.println(number);
        
        String a = "The duck walked up to the lemonade stand";
        String b = "Darwin goes to sleep";
        String c = "Wake up, Mr. Freeman";
        
        //1
        System.out.println(c.length());
        //^^ it would print out 20
        
        //2
        System.out.println(b.substring(15));
        //Prints index 15 and after 
        //prints sleep
        
        //3
        System.out.println(a.substring(5,7));
        //prints starting index 5 up to 7
        //prints uc
        
        //What would the code be to get 
        ///4 "lemon"
        System.out.println(a.substring(26,31));
        
        //5 "Mr. Freeman
        System.out.println(c.substring(9));
        
        //6. Is this positive, negative, or a 0
        System.out.println(b.compareTo(a));
        //b = D, letter 4, a = T, letter something
        //letter 4 - letter something = -16
        //b comes before, thus itll be negative
        //(to be more specific, -16??)
        
        //7. What would be the code to find the position of the word "stand"?
        int location5 = a.indexOf("stand");
        System.out.println(location5);
        
        
        
        
        
    }
}
