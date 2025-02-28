// Check if Numbers Are Ascending in a Sentence
import java.util.*;

public class PracticeDay1 {
    public static void main(String[] args) {
        //s = "1 box has 3 blue 4 red 6 green and 12 yellow marbles"
        String s = "1 box has 9 blue 4 red 6 green and 12 yellow marbles";
        String[] words = s.split(" ");
        int prev = -1;
        for (int i = 0; i < words.length; i++) {
            System.out.println(Integer.valueOf(words[i]));
            if (Character.isDigit(words[i].charAt(0))) {
                if (Integer.valueOf(words[i]) > prev) {
                    prev = Integer.valueOf(words[i]);
                } else {
                    System.out.println(false);
                    break;
                }
            }
        }
        System.out.println(true);



        // String[] arr = s.split("\\s");
        // int asc = -1;
        // for(int i=0; i<arr.length; i++) {
        //     try {
        //     if(Integer.parseInt(arr[i]) instanceof Number) {
        //         if(asc < Integer.parseInt(arr[i]))
        //             asc = Integer.parseInt(arr[i]);
        //         else {
        //             System.out.println(false);
        //             break;
        //         }
        //     }
        //     } catch (Exception e) {
        //         continue;
        //     }
        // }
        // System.out.println(true);
    }
}
