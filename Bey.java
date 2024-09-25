
/**
 * Write a description of class bey here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bey
{
    //5 fields
    //2 constructors
    //a mutator and accesor method for each field you created
    //3 other methods of my choosing
    
    //Fields
    private String type;
    private String top;
    private String metal;
    private String tip;
    private boolean burst;
    private String color;
    private boolean spin;
    
    //Constructor #1
    public Bey(){
        type = "Attack";
        top = "Fafnir";
        metal = "DR101";
        tip = "Valtriex speed";
        burst = false;
        spin = false;
        color = "yellow";
    }
    
    //Constructor #2
    public Bey(String beyType, String beyTop, String beyMetal, String beyTip, String beyColor){
        type = beyType;
        top = beyTop;
        metal = beyMetal;
        tip = beyTip;
        color = beyColor;
    }
    
    //Accessor Methods
    public boolean isBurst(){
        return burst;
    }
    
    public boolean isSpin(){
        return spin;
    }
    
     public String getType(){
        return type;
    }
    
    public String getTop(){
        return top;
    }
    
    public String getMetal(){
        return metal;
    }
    
    public String getTip(){
        return tip;
    }
    
    public String getColor(){
        return color;
    }
    
    //Mutator Methods
    public void setType(String newType){
        type = newType;
    }
    
    public void setTop(String newTop){
        top = newTop;
    }
    
    public void setMetal(String newMetal){
        metal = newMetal;
    }
    
    public void setTip(String newTip){
        tip = newTip;
    }
    
    public void setColor(String newColor){
        color = newColor;
    }
    
    public void setSpin(boolean newSpin){
        spin = newSpin;
    }
    
     public void setBurst(boolean newBurst){
        burst = newBurst;
    }
    
    //Other Methods
    public void LaunchBeyblade(){
        System.out.println("You launched your beyblade! :)");
        spin = true;
        System.out.println("It is now spinning!");
    }
    
    public void AttackLui(){
        System.out.println("You attack Lui's beyblade");
        System.out.println("despite your beyblade going mock 10, it burst barely touching luis bey");
        System.out.println("your bey is now burst :(");
        burst = true;
    }
    
    public void PaintBeybladeBlue(){
        System.out.println("You take your beyblade to get a paint job");
        System.out.println("You like the color blue so you paint it");
        System.out.println("Your beyblade is now blue");
        color = "blue";
    }
    
    //random num 1 - 10, represents your card
    //requires an object
    //player and dealer have this in common
    
    
    
    
    
}
