// 20. Generate Parentheses
import java.util.*;

public class GenerateParentheses {
    public static void main(String[] args) {
        // n = 3
        int n = 3;
        List<String> res = new ArrayList<>();
        genParentheses(n, 0, 0, res, "");
        System.out.println(res);
    }

    static void genParentheses(int n, int open, int close, List<String> res, String curr){
        if(n == open && n == close){
            res.add(curr);
            return;
        }
        if(n < open || n < close){
            return;
        }

        if(close < open){
            genParentheses(n, open + 1, close, res, curr+"(");
            genParentheses(n, open, close+1, res, curr+")");
        } else {
            genParentheses(n, open + 1, close, res, curr+"(");
        }
    }
}
