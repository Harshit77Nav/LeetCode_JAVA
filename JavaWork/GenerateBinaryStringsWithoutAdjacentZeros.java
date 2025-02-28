//3211. Generate Binary Strings Without Adjacent Zeros
import java.util.*;

public class GenerateBinaryStringsWithoutAdjacentZeros {
    public static void main(String[] args) {
        // n = 3;
        int n = 11;
        String input = "";
        StringBuilder temp = new StringBuilder();
        for(int i=0; i<n; i++){
            input += "0";
            input += "1";
        }
        List<String> res = new ArrayList<>();
        generateBinary(0, input, res, temp, n);
            System.out.println(res.toString());
        }
        
        public static void generateBinary(int index, String str, List<String> result, StringBuilder temp, int n) {
            if(temp.length() == n && !result.contains(temp.toString())){
                result.add(temp.toString());
                return;
            } else if(temp.length() > n) {
                return;
            }

            for(int i=index; i<str.length(); i++) {
                if(temp.length() > 0 && temp.charAt(temp.length()-1) == '0' && str.charAt(i) == '0'){
                    continue;
                }
                temp.append(str.charAt(i));
                generateBinary(i, str, result, temp, n);
                temp.deleteCharAt(temp.length()-1);
            } 
    }
}
