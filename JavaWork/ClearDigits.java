//3174. Clear Digits
import java.util.*;

public class ClearDigits {
    public static void main(String[] args) {
        // s = "abc"
        String s = "cbs34";
        StringBuilder str = new StringBuilder();

        for(int i=0; i<s.length(); i++) {
            Character ch = s.charAt(i);
            if(Character.isDigit(ch)) {
                str.deleteCharAt(str.length()-1);
            } else {
                str.append(s.charAt(i));
            }
        }
        String res = new String(str);
        System.out.println(res);
        
    }
}
