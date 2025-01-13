
/**
 * Write a description of class Chair here.
 *
 * @author Fernando Ortega
 * @version 9.19.24
 */

//5 fields
//2 constructors
//a mutator and accesor method for each field you created
//3 other methods of my choosing
public class Chair{
    //Things a chair HAS
    
    //Can be called
    //Private Instance Variables
    //or Fields
    private int wheels;
    private int legs;
    private String bodyType;
    private String cushion;
    private String brand;
    private boolean broken;
    
    //Dont do this under normal conditions!!!!! >:(
    public String color;
    public static boolean seat = true; //static means it belongs to the class(Chair.seat) 
    
    //Constructor
    public Chair(){
        wheels = 5;
        legs = 5;
        bodyType = "plastic";
        cushion = "none";
        brand = "Unknown (Mr. Wie be doesn't want to look it up)";
        broken = false;
    }
    
    //Also a constructor
    public Chair(int numOfWheels, int numOfLegs, String body, String cushion, String brand){
        //cannot mess with the order ^^^^
        //can have multiple constructors, aslong as theyre not the same(different order^^^)
        wheels = numOfWheels;
        legs = numOfLegs;
        bodyType = body;
        this.cushion = cushion;
        this.brand = brand;
    }
    //Accessor Method
    //It allows us to "see" the variable, but you cant change it
    public boolean isBroken(){
        return broken;
    }
    
    public String getbodyType(){
        return bodyType;
    }
    
    public int getWheels(){
        return wheels;
    }
    
    public int getLegs(){
        return legs;
    }
    
    public String cushionType(){
        return cushion;
    }
    
    public String getBrand(){
        return brand;
    }
    
    //Mutator Methods
    public void setLegs(int newLegs){
        legs = newLegs;
    }
    
    public void setWheels(int wheels){
        this.wheels = wheels;//^^ its the same, you dont want to reset the paremeter
    }
    
    //Other Methods
    public void setChairOnFire(){
        System.out.println("You know, you really shouldnt light the chair on fire.");
        System.out.println("Thats considered Arson");
        System.out.println("The chair is now broken");
        broken = true;
    }
    
     public void ohmy(){
        System.out.println(this);
    }
}
    