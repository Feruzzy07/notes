
/**
 * Write a description of class controlStatements here.
 *
 * @author Fernando Ortega
 * @version 9.6.24
 */
public class controlStatements
{
    public static void gradeCalc(int percentage){
        if(percentage >= 90){
            System.out.println("A");
            // && means AND
            // || means OR
            // ! means NOT
        } else if(percentage >=80 && percentage < 90){
            System.out.println("B");
        } else if(percentage >= 70){
            System.out.println("C");
        } else if (percentage >= 60){
            System.out.println("D");
        }else {
            System.out.println("F");
        }
        
        if(percentage > 80){
            System.out.println("Good Job!");
        }
    }
    
    public static String refactoredGradeCalc(int percentage){
        if(percentage >= 90){
            return "A";
        }else if(percentage >= 80){
            return "B";
        }else if (percentage >= 70){
            return "C";
        } else if (percentage >= 60){
            return "D";
        }
        return "F";
    }
    
    public static void main(){
        System.out.println(refactoredGradeCalc(94));
        System.out.println(refactoredGradeCalc(74));
        String letter = refactoredGradeCalc(82);
        System.out.println(letter);
    }
    
    //WHEN TO USE EACH LOOP
    //FOR LOOPS - When you run it, you know EXACTLY  how many times it will loop
    //WHILE LOOPS - When you DONT know how many times it will go, just when it will stop
    
}
