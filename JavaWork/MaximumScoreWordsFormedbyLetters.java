// 1255. Maximum Score Words Formed by Letters
import java.util.*;

public class MaximumScoreWordsFormedbyLetters {
    public static void main(String[] args) {
        //words = ["xxxz","ax","bx","cx"], letters = ["a","a","c","d","d","d","g","o","o"], score = [4,4,4,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,5,0,10]
        String[] words = {"xxxz","ax","bx","cx"}; 
        char[] letters = {'z','a','b','c','x','x','x'};
        int[] score = {4,4,4,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,5,0,10};

        Map<Character, Integer> myMap = new HashMap<>();
        Arrays.sort(letters);

        int i = 0;
        int j = 0;
        while(i < score.length) {
            if(myMap.containsKey(letters[j])) {
                j++;
                continue;
            } else if(score[i] != 0) {
                myMap.put(letters[j], score[i]);
                i++;
                j++;
                continue;
            }
            i++;
        }
        int totalsum = 0;
        for(String word : words) {
            Map<Character, Integer> temp = new HashMap<>(myMap);
            int count = 0;
            int tempSum = 0;
            for(int l = 0; l < word.length(); l++) {
                if(temp.containsKey(word.charAt(l)) && temp.get(word.charAt(l)) > 0){
                    temp.put(word.charAt(l), temp.get(word.charAt(l))-1);
                    count++;
                    tempSum += myMap.get(word.charAt(l));
                } else {
                    break;
                }
            }
            if(count == word.length()) {
                totalsum += tempSum;
            }
        }
        System.out.println(myMap);
        System.out.println(totalsum);
    }
}
