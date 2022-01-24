package String;
import java.util.*;
public class Detect_Capital {
    static boolean detectCapitalUse(String word) {
        int n=word.length();
        boolean s=Character.isUpperCase(word.charAt(0));
        int upper=0;
        int lower=0;
        for(int i=0;i<n;i++){
            if(Character.isUpperCase(word.charAt(i))){
                upper++;
            }
            else{
                lower++;
            }
        }
        if(upper==n || lower==n ||s && lower==(n-1)){
            return true;
        }
        else{
            return false;
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.print(detectCapitalUse(str));
    }
}
