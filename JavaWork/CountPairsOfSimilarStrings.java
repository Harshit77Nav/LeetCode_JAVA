//2506. Count Pairs Of Similar Strings
import java.util.*;

public class CountPairsOfSimilarStrings {
    public static void main(String[] args) {
        //words = ["aba","aabb","abcd","bac","aabc"]
        String[] words = {"aba", "aabb" ,"abcd" ,"bac" ,"aabc"};
        
        int count = 0;
        for(int i=0; i<words.length; i++) {
            Set<Character> mySet = new HashSet<>();
            for(int j=0; j<words[i].length(); j++) {
                mySet.add(words[i].charAt(j));
            }
            for(int k=i+1; k<words.length; k++) {
                boolean flag = true;
                boolean present[] = new boolean[26];
                int alphaCount = 0;
                for(int l=0; l<words[k].length(); l++) {
                    int idx = words[k].charAt(l) - 'a';
                    if(mySet.contains(words[k].charAt(l))) {
                        if(present[idx] == false) {
                            present[idx] = true;
                            alphaCount++;
                        }
                        continue;
                    } else {
                        flag = false;
                    }
                }
                if(flag == true && mySet.size() == alphaCount) {
                    count++;
                }
            }
        }
        System.out.println(count);





























        // int count = 0;
        // for(int i=0; i<words.length; i++) {
        //     boolean attendence[] = new boolean[26];
        //     int trueCount = 0;
        //     for(int j=0; j<words[i].length(); j++) {
        //         int idx = words[i].charAt(j) - 'a';
        //         if(attendence[idx] == false) {
        //             attendence[idx] = true;
        //             trueCount++;
        //         }
        //     }
        //     for(int k=i+1; k<words.length; k++) {
        //         boolean flag = true;
        //         boolean present[] = new boolean[26];
        //         int alphaCount = 0;
        //         for(int l=0; l<words[k].length(); l++) {
        //             int idx = words[k].charAt(l) - 'a';
        //             if(attendence[idx] == true) {
        //                 if(present[idx] == false) {
        //                     present[idx] = true;
        //                     alphaCount++;
        //                 }
        //                 continue;
        //             } else {
        //                 flag = false;
        //             }
        //         }
        //         if(flag == true && trueCount == alphaCount) {
        //             count++;
        //         }
        //     }
        // }
        // System.out.println(count);
    }
}
