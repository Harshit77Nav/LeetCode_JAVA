// 3110. Score of a String

public class ScoreOfAString3110 {
    public static void main(String[] args) {
        // s = "hello"
        String s ="zaz";
        int score = 0;
        for(int i=0; i<s.length()-1; i++){
            score = score + Math.abs((int)s.charAt(i)-(int)s.charAt(i+1));
        }
        System.out.println(score);
    }    
}
