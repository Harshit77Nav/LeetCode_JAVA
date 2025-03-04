
// 1079. Letter Tile Possibilities
// import java.util.*;

public class LetterTilePossibilities {

    public static void main(String[] args) {
        // tiles = "AAB"
        String tiles = "TBAKNLM";
        int freq[] = new int[26];
        for(int i=0; i<tiles.length(); i++) {
            freq[tiles.charAt(i) - 'A']++;
        }

        int count = bt(freq);
        System.out.println(count);
    }

    public static int bt(int[] freq) {
        int count = 0;
        for(int i=0; i<26; i++) {
            if(freq[i]==0) continue;
            count++;
            freq[i]--;
            count += bt(freq);
            freq[i]++;
        }
        return count;
    }

























    // public static void main(String[] args) {
    //     // tiles = "AAB"
    //     String tiles = "TBAKNLM";
    //     boolean[] used = new boolean[tiles.length()];
    //     Set<String> mySet = new HashSet<>();

    //     getPossibilities( mySet, "", tiles , used);
    //     // return mySet.size()-1;
    // }

    // public static void getPossibilities( Set<String> mySet, String str, String tiles, boolean[] used) {
    //     if(mySet.contains(str)) return;
    //     mySet.add(str);

    //     for (int i = 0; i < tiles.length(); i++) {
    //         if(used[i]) continue;
    //         used[i] = true;
    //         getPossibilities( mySet, str+tiles.charAt(i) , tiles, used);
    //         used[i] = false;
    //     }
    // }




















    // public static void main(String[] args) {
    //     // tiles = "AAB"
    //     String tiles = "TBAKNLM";
    //     Map<Character, Integer> myMap = new HashMap<>();
    //     for (int i = 0; i < tiles.length(); i++) {
    //         myMap.put(tiles.charAt(i), myMap.getOrDefault(tiles.charAt(i), 0) + 1);
    //     }
    //     StringBuilder str = new StringBuilder();
    //     Set<String> mySet = new HashSet<>();

    //     getPossibilities(0, mySet, str, tiles, myMap);
    //     // System.out.println(mySet);
    //     System.out.println(mySet.size());
    // }

    // public static void getPossibilities(int index, Set<String> mySet, StringBuilder str, String tiles,
    //         Map<Character, Integer> myMap) {
    //     if (str.length() != 0 && str.length() <= tiles.length()) {
    //         Map<Character, Integer> temp = new HashMap<>();
    //         for (int i = 0; i < str.length(); i++) {
    //             temp.put(str.charAt(i), temp.getOrDefault(str.charAt(i), 0) + 1);
    //         }
    //         boolean flag = false;
    //         for (Map.Entry<Character, Integer> entry : temp.entrySet()) {
    //             if (entry.getValue() <= myMap.get(entry.getKey())) {
    //                 flag = true;
    //                 continue;
    //             } else {
    //                 flag = false;
    //                 break;
    //             }
    //         }
    //         if (flag) {
    //             mySet.add(str.toString());
    //         }
    //     }
    //     if (str.length() > tiles.length()) {
    //         return;
    //     }

    //     for (int i = 0; i < tiles.length(); i++) {
    //         if(mySet.contains(tiles.charAt(i))) continue;
    //         str.append(tiles.charAt(i));
    //         getPossibilities(index + 1, mySet, str, tiles, myMap);
    //         str.deleteCharAt(str.length() - 1);
    //     }
    // }
}
