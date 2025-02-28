//2062. Count Vowel Substrings of a String
import java.util.*;

public class leetcode2062 {
    public static void main(String[] args) {
        // word = "cuaieuouac"
        String word = "unicornarihan";
        int count = 0;
        Set<Character> set = new HashSet<>();
        for(int i=0; i<word.length(); i++){
            for(int j=i; j<word.length(); j++){
                if(word.charAt(j) == 'a' || word.charAt(j) == 'e' || word.charAt(j) == 'i' || word.charAt(j) == 'o' || word.charAt(j) == 'u'){
                    set.add(word.charAt(j));
                    if(set.size() >= 5){
                        count++;
                    }
                } else {
                    break;
                }
            }
            set.clear();
        } 
        System.out.println(count);
    }
}
