
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
    
    //Constructor #1
    public Bey(){
        type = "Attack";
        top = "Fafnir";
        metal = "DR101";
        tip = "Valtriex speed";
        burst = false;
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
    
    //Other Methods
    public void LaunchBeyblade(){
        System.out.println("You launched your beyblade! :)");
        System.out.println("Lui just made you burst :(");
        burst = true;
    }
    
}
