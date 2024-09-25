
/**
 * Write a description of class blackjack here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Hand
{
    private int total;
    private boolean bust;
    private int card1; 
    private int card2;
    
    //Constructor
    public Hand(){
        card1 = (int)(Math.random()*9 + 1);
        card2 = (int)(Math.random()*9 + 1);
        total = card1 + card2;
    }
    
    public Hand(boolean handBust){
        bust = handBust;
        card1 = (int)(Math.random()*9 + 1);
        card2 = (int)(Math.random()*9 + 1);
        total = card1 + card2;
    }
    
    //Accessor methods
    public int theTotal(){
        return total;
    }
    
    public boolean getBust(){
        return bust;
    }
    
    public int getCard(){
        return card1;
    }
    
    public int getCard2(){
        return card2;
    }
    
    //Mutator method
    public void setTotal(int newTotal){
        total = newTotal;
    }
    
     public void setBust(boolean newBust){
        bust = newBust;
    }
    
    //Other methods
    
}
