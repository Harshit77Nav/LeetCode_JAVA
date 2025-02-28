// 2085. Count Common Words With One Occurrence
import java.util.*;

public class CountCommonWordsWithOneOccurrence {
    public static void main(String[] args) {
        // words1 = ["leetcode","is","amazing","as","is"], words2 = ["amazing","leetcode","is"]
        String[] words1 = {"leetcode","is","amazing","as","is"},  words2 = {"amazing","leetcode","is"};

        Map<String, Integer> map = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        for(String word : words1){
            map.put(word, map.getOrDefault(word, 0)+1);
        }
        for(String word : words2) {
            map2.put(word, map2.getOrDefault(word, 0)+1);
        }
        int count = 0;
        for(String word : words1) {
            if(map.containsKey(word) && map.get(word) == 1 && map2.containsKey(word) && map2.get(word) == 1) {
                count++;
            }
        }
        System.out.println(count);
    }
}
