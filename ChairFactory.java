
/**
 * Write a description of class ChairFactory here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ChairFactory
{
    public static void main(){
        Chair yourChair = new Chair();
        Chair myChair = new Chair(5,5,"Racing", "soft", "IDK");
        System.out.println("Do chairs have a seat?");
        System.out.println(Chair.seat);
        Chair.seat = false;
        System.out.println(yourChair);
        System.out.println(yourChair.color);
        System.out.println(yourChair.isBroken());
        
        System.out.println("Your chair has " + yourChair.getLegs() + "legs.");
        System.out.println("My chair has " + myChair.getWheels() + " wheels");
        
        
        
    }
}
