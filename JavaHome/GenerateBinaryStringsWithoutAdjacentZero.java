// 3211. Generate Binary Strings Without Adjacent Zeros
import java.util.*;

public class GenerateBinaryStringsWithoutAdjacentZero {
    public static void main(String[] args) {
        // n = 3;
        int n = 11;
        StringBuilder temp = new StringBuilder();
        Set<String> res = new HashSet<>();
        generateBinary(0, res, temp, n);
        System.out.println(res.toString());
            // return res;
        }
        
        public static void generateBinary(int index, Set<String> result, StringBuilder temp, int n) {
            if(temp.length() == n ){
                result.add(temp.toString());
                return;
            } 

            if(temp.length() == 0 || temp.charAt(temp.length()-1) != '0') {
                temp.append('0');
                generateBinary(index+1, result, temp, n);
                temp.deleteCharAt(temp.length()-1);
            }

            temp.append('1');
            generateBinary(index+1, result, temp, n);
            temp.deleteCharAt(temp.length()-1);
        }
}



// second solution ........................................................................optimal approach
// class Solution {
    
//     public List<String> validStrings(int n) {
//         var results = new ArrayList<String>();
//         generateValidStrings("", n, results);
//         return results;
//     }

//     private static void generateValidStrings(String current, int n, List<String> results) {
//         if (current.length() == n) {
//             results.add(current);
//             return;
//         }

//         if (current.isEmpty() || current.endsWith("1")) {
//             generateValidStrings(current + "0", n, results);
//             generateValidStrings(current + "1", n, results);
//         } else {
//             generateValidStrings(current + "1", n, results);
//         }
//     }

// }
