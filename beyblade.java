
/**
 * Write a description of class beyblade here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class beyblade
{
   /**
     * Your bey name
     * Opponents Bey
     * The beyblade type
     * Random numbers for each beyblade
     * Whichever one is higher wins the battle
     * Determine that gap, and choose how it won(ex: busrt/ringout)
     */
    public static void beybladeGame(){
        Scanner scanner = new Scanner(System.in);
        //int randomNumBeyblade1 = (int)(Math.random()*100 + 1);//Generates a random number between 1-100
        //int randomNumBeyblade2 = (int)(Math.random()*100 + 1);//Generates a random number between 1-100
        
        //Get beyblade names from users
        System.out.println("Player 1 Choose a name for your Beyblade!");
        String beyName = scanner.next();
        
        System.out.println("Player 2 Choose a name for your Beyblade!");
        String beyName2 = scanner.next();
        
        //Player 1 chooses their beyblade type
        System.out.println("Player 1 Choose a beyblade type");
        System.out.println("Choose from: Attack, Defense, or Stamina");
        System.out.println("Type 1 for attack, 2 for defense, and 3 for Stamina");
        
        int typeNum = scanner.nextInt();
        String type1 = "";
        if(typeNum == 1){
            type1 = "Attack";
        } else if(typeNum == 2){
            type1 = "Defense";
        } else if(typeNum == 3){
            type1 = "Stamina";
        }
        System.out.println(type1);
        
        //Player 2 chooses their beyblade type
        System.out.println("Player 2 Choose a beyblade type");
        System.out.println("Choose from: Attack, Defense, or Stamina");
        System.out.println("Type 1 for attack, 2 for defense, and 3 for Stamina");
        
        int typeNum2 = scanner.nextInt();
        String type2 = "";
        if(typeNum2 == 1){
            type2 = "Attack";
        } else if(typeNum2 == 2){
            type2 = "Defense";
        } else if(typeNum2 == 3){
            type2 = "Stamina";
        }
        System.out.println(type2);
        
        int points1 = 0;
        int points2 = 0;

        /*if(randomNumBeyblade1 > randomNumBeyblade2){
            int diff = randomNumBeyblade1 - randomNumBeyblade2;
            if(diff >= 40){
                points1 =+ 2;
            }else if(diff >= 20){
                points1++;
            }else if(diff >= 10){
                points1++;
            }
        }else if(randomNumBeyblade2 > randomNumBeyblade1){
            int diff = randomNumBeyblade2 - randomNumBeyblade1;
            if(diff >= 40){
                points2 =+ 2;
            }else if(diff >= 20){
                points2++;
            }else if(diff >= 10){
                points2++;
            }
        }
        */        
        
        while(points1 < 3 || points2 < 3){
            int randomNumBeyblade1 = (int)(Math.random()*100 + 1);//Generates a random number between 1-100
            int randomNumBeyblade2 = (int)(Math.random()*100 + 1);//Generates a random number between 1-100
            
            //System.out.println(randomNumBeyblade1 + "#1 num");
            //System.out.println(randomNumBeyblade2 + "#2 num");
            if(randomNumBeyblade1 > randomNumBeyblade2){
                int diff = randomNumBeyblade1 - randomNumBeyblade2;
                //System.out.println(diff);
                //System.out.println(randomNumBeyblade1 + "#1 num");
                //System.out.println(randomNumBeyblade2 + "#2 num");
                if(diff >= 40){
                    points1 = points1 + 2;
                    System.out.println(beyName + " made " + beyName2 + " burst!");
                }else if(diff >= 20){
                    points1++;
                    System.out.println(beyName + " wins by ringout finish");
                }else if(diff >= 0){
                    points1++;
                    System.out.println(beyName + " wins by survivor finish");
                }
            }else if(randomNumBeyblade2 > randomNumBeyblade1){
                int diff = randomNumBeyblade2 - randomNumBeyblade1;
                //System.out.println(diff);
                //System.out.println(randomNumBeyblade1 + "#1 num");
                //System.out.println(randomNumBeyblade2 + "#2 num");
                if(diff >= 40){
                    points2 = points2 + 2;
                    System.out.println(beyName2 + " made " + beyName + " burst!");
                }else if(diff >= 20){
                    points2++;
                    System.out.println(beyName2 + " wins by ringout finish");
                }else if(diff >= 0){
                    points2++;
                    System.out.println(beyName2 + " wins by survivor finish");
                }
            }else{
                System.out.println("You guys both bursted! No points awarded!");
            }
            
            //System.out.println(points1);
            //System.out.println(points2);
                
            if(points1 >= 3){
                System.out.println(beyName + " won the round!");
                return;
            }else if(points2 >= 3){
                System.out.println(beyName2 + " won the round!");
                return;
            }
        }
        
        
        /*for (int i = 5; i > 0; i--){
            int guess = scanner.nextInt();
            if(randomNum > guess){
                System.out.println("Try Higher");
            } else if(guess > randomNum){
                System.out.println("Try Lower");
            } else{
                System.out.println("Yay you guessed it! :)");
                return;
            }
        }
        System.out.println("Sorry you ran out of tries! :(");
        System.out.println("The number was " + randomNum);
        return;
        */
    }
}
