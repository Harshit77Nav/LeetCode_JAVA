// 2068. Check Whether Two Strings are Almost Equivalent
import java.util.*;

public class leetcode2068 {
    public static void main(String[] args) {
        // word1 = "aaaa", word2 = "bccb"
        String word1 = "aaaab", word2 = "zzzza";
        if(word1.length() < 3){
            System.out.println(true);
        }
        Boolean flag = false;
        Map <Character, Integer> map = new HashMap<>();
        Map <Character, Integer> map2 = new HashMap<>();
        for(int i = 0; i < word1.length(); i++){
            map.put(word1.charAt(i),map.getOrDefault(word1.charAt(i), 0)+1);
            map2.put(word2.charAt(i),map2.getOrDefault(word2.charAt(i), 0)+1);
        }
        for(int i = 0; i < word2.length(); i++) {
            int value1 = map.get(word1.charAt(i));
            int value2 = map2.getOrDefault(word1.charAt(i), 0);
            int dif = Math.abs(value1-value2);
            if(dif > 3){
                System.out.println(false);
            }
            int value3 = map.getOrDefault(word2.charAt(i), 0);
            int value4 = map2.getOrDefault(word2.charAt(i), 0);
            int dif2 = Math.abs(value3-value4);
            if(dif2 > 3){
                System.out.println(false);
            }
            if(map.containsKey(word2.charAt(i))){
                flag = true;
            }
        }
        System.out.println(flag?true:false);


        //solution 2 ...................................................................................BEST Solution
        /*
        HashMap<Character, Integer> map = new HashMap<>();

        for (Character c : word1.toCharArray())
            map.put(c, map.containsKey(c) ? map.get(c) + 1 : 1);

        for (Character c : word2.toCharArray())
            map.put(c, map.containsKey(c) ? map.get(c) - 1 : -1);

        for (int i : map.values()){
            if(Math.abs(i)>=4)
                return false;
        }
        
        return true;
         */
    }
}
