
/**
 * Write a description of class blackjack here.
 *
 * @author Fernando Ortega
 * @version 9.30.24
 */
public class Hand
{
    private int total;
    private boolean bust = false;
    private int card1; 
    private int card2;

    //Constructor

    public Hand(){
        card1 = getCard();
        card2 = getCard();
    }

    //Accessor methods
    public int theTotal(){
        return total;
    }

    public boolean getBust(){
        return bust;
    }

    public int getCard(){
        int newCard = (int)(Math.random()*10 + 1);
        total += newCard;
        if (total > 21){
            bust = true;
        }
        return newCard;
    }

    public int getCard1(){
        return card1;
    }

    public int getCard2(){
        return card2;
    }

}
