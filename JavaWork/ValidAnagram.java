// 242. Valid Anagram;

import java.util.*;

public class ValidAnagram {
    // SOLUTION 1.................................................................................................
    public static void main(String[] args) {
        // s = "anagram", t = "nagaram";
        String s = "ab", t = "a";
        Map<Character,Integer> map = new HashMap<>(); 
        for(int i=0; i<s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), map.get(s.charAt(i))+1);
            } else {
                map.put(s.charAt(i), 1);
            }
        }
        for(int i=0; i<t.length(); i++){
            if(map.containsKey(t.charAt(i)) && map.get(t.charAt(i))>0){
                map.put(t.charAt(i),map.get(t.charAt(i))-1);
            } else {
                System.out.println(false);
                break;
            }
        }
        System.out.println(s.length() == t.length() ? true : false);
    }

    // SOLUTION 2 ..................................................................................................
    // public static void main(String[] args) {
    //     String s = "ab", t = "a";

    //     char[] arr1 = s.toCharArray();
    //     char[] arr2 = t.toCharArray();

    //     Arrays.sort(arr1);
    //     Arrays.sort(arr2);

    //     System.out.println(Arrays.equals(arr1, arr2));
    // }
}
