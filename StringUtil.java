
/**
 * Write a description of class StringUtil here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StringUtil
{
    public static String apcsReplaceAll(String str, String oldStr, String newStr){
        //find the position of the first oldStr in str
        int pos = str.indexOf(oldStr);      
        while (pos >= 0){
            String everythingBefore = str.substring(0, pos);
            String everythingAfter = str.substring(pos + oldStr.length());
            
            str = everythingBefore + newStr + everythingAfter; 
            
            //Find the next spot to change
            pos = str.indexOf(oldStr, pos + 1);
        }
        
        return str;
    }
}
