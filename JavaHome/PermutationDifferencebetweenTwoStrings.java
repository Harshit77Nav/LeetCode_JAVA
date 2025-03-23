// 3146. Permutation Difference between Two Strings
// import java.util.*;;

public class PermutationDifferencebetweenTwoStrings {
    public static void main(String[] args) {
        // s = "abc", t = "bac"
        String  s = "abc", t = "bac";
        // Map<Character, Integer> myMap = new HashMap<>();


        //.........................................First Approach
        // for(int i=0; i<s.length(); i++) {
        //     myMap.put(s.charAt(i), i);
        // }
        // int sum = 0;
        // for(int i=0; i<t.length(); i++) {
        //     sum += Math.abs(i - myMap.get(t.charAt(i)));
        // }




        //........................................Second Approach (better then first)
        int sum = 0;
        for(int i=0; i<s.length(); i++) {
            int index = t.indexOf(s.charAt(i));
            sum += Math.abs(index - i);
        }
        System.out.println(sum);
    }
}
