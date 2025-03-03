// 139. Word Break
import java.util.*;

public class WordBreak {
    public static void main(String[] args) {
        //s = "leetcode", wordDict = ["leet","code"]
        String s = "catsandog";
        String[] wordDict = {"cats","dog","sand","and","cat"};
        Set<String> mySet = new HashSet<>();
        for(int i=0; i < wordDict.length; i++) {
            mySet.add(wordDict[i]);
        }
        int i = 1;
        int matchIdx = 0;
        int lastIdx = 0;
        while (i <= s.length()) {
            String str = s.substring(matchIdx, i);
            String str3 = s.substring(lastIdx, i);
            String str2 = "";
            if(mySet.contains(str3)) {
                lastIdx = i;
            }
            if(i<s.length()){
                str2 = s.substring(matchIdx, i+1);
            } 
            if(mySet.contains(str) && mySet.contains(str2)) {
                i++;
                continue;
            } else if(mySet.contains(str)) {
                matchIdx = i;
            }
            i++;
        }
        if(matchIdx == s.length() || lastIdx == s.length()) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
