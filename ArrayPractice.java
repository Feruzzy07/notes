
/**
 * Write a description of class ArrayPractice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArrayPractice
{
    //static means m
    static String[] shoppingList;
    public static void main(String[] args){
        System.out.println("Hello World");
    }
    
    public static void main2(){
        //Initialization
        shoppingList = new String[5];
        
        //Where we add things to the array
        shoppingList[0] = "Lunchly";
        shoppingList[1] = "Moldy Cheese";
        shoppingList[2] = "Prime";
        shoppingList[3] = "Feastable";
        shoppingList[4] = "Thick of It Record Player";
        
        //The first item is always index 0 
        //The last index is always array.length - 1; 
        
        System.out.println("There are " + shoppingList.length + " items in the list");
        //Length (is an array) is a PUBLIC FIELDS!!!!!
        
        //different than length() in strings, if no () its an array
        //() show that there would be a method
        
        //Modify the array
        shoppingList[1] = "Drippy Cheese";
    }
    
    //Short for of making an array
    //This only works if you ceclare AND instantiate it ON THE SAME LINE
    public static void main3(){
        int[] numbers = {5 , 4, 0};
        String[] things = {"orange", "blue", "green", "purple"};
        
        //LOOPINGS THROUGH AN ARRAY 
        //The old way:
        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
        
        System.out.println();
        System.out.println();
        System.out.println();
        
        //The new way
        //Note: DO NOT USE IF IT:
        //1. You need to modify the array itself
        //2. You need the index number
        for(String color: things){
            System.out.println(color);
        }
        //things is an array containing STRING objects
        //WE will create a variable called "color" to represent each STRING object in "things"
        for(int num: numbers){
            System.out.println(num);
        }
    }
}
