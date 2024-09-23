
/**
 * Write a description of class gambleee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
//2 d 6 sizes
//only win when you get 7
// 1$ per game
//if win you add 5$(4$ profit)
//
public class gambleee
{
    public static void Lucky7(){
        int money = 10;
        int round = 0;
        int roundpeak = 0;
        int peak = 10;
        while(money > 0){
            int Dice1 = (int)(Math.random()*6 + 1);
            int Dice2 = (int)(Math.random()*6 + 1);
            int total = Dice1 + Dice2;
            money--;
            if(total > 7 || total < 7){
                System.out.println("You rolled a " + total + "! You lost money :(");
                System.out.println("You now have $" + money);
                round++;
            }else{
                money += 5;
                System.out.println("You rolled a " + total + "! Yippie you won 5$ :)");
                System.out.println("You now have $" + money);
                round++;
            }
            if(money > peak){
                peak = money;
                roundpeak = round;
            }
        }
        System.out.println();
        System.out.println("Your highest total was " + peak);
        System.out.println("You should have stopped on round " + roundpeak); 
        System.out.println("You made it to round " + round);
    }

}
