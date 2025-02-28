//125. Valid Palindrome
import java.util.*;

public class ValidPalindrome {
    public static void main(String[] args) {
        // s = "A man, a plan, a canal: Panama"
        String s = "race a car";
        String str = s.toLowerCase();
        StringBuilder res = new StringBuilder();
        for(int i=0; i<str.length(); i++) {
            int temp = str.charAt(i);
            if(temp >= 96 && temp <= 122) {
                res.append(str.charAt(i));
            } else if(temp >= 48 && temp <= 57) {
                res.append(str.charAt(i));
            }
        }
        if(res.toString().equals(res.reverse().toString())){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
