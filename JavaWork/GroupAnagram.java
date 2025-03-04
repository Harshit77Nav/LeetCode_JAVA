import java.util.*;

public class GroupAnagram {
    public static void main(String[] args) {
        // n = 12
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        // List<List<String>> res = new ArrayList<>();
        Map<String, List<String>> myMap = new HashMap<>();
        for(int i=0; i<strs.length; i++) {
            char[] arr = strs[i].toCharArray();
            Arrays.sort(arr);
            String temp = new String(arr);
            
            myMap.putIfAbsent(temp, new ArrayList<>());
            myMap.get(temp).add(strs[i]);
            
        }
        
        System.out.println(myMap.values());
    }

}
