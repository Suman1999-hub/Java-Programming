/*
                            //520. Detect Capital

We define the usage of capitals in a word to be right when one of the following cases holds:

        All letters in this word are capitals, like "USA".
        All letters in this word are not capitals, like "leetcode".
        Only the first letter in this word is capital, like "Google".
        
Given a string word, return true if the usage of capitals in it is right.

Example 1:

    Input: word = "USA"
    Output: true
Example 2:

    Input: word = "FlaG"
    Output: false
    
*/
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
