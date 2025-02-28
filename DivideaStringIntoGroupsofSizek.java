// 2138. Divide a String Into Groups of Size k
import java.util.*;

public class DivideaStringIntoGroupsofSizek {
    public static void main(String[] args) {
        //s = "abcdefghi", k = 3, fill = "x"
        String s = "abcdefghi", fill = "x";
        int k = 3;
        
        StringBuilder str = new StringBuilder(s);
        int rem = s.length()%k;
        if(rem != 0){
            for(int i=0; i<k-rem; i++) 
                str.append(fill);
        }
        
        String[] res = new String[str.length()/k];
        int count = 0, idx = 0;
        StringBuilder temp = new StringBuilder();
        for(int i=0; i<str.length(); i++) {
            count++;
            temp.append(str.charAt(i));
            if(count == k) {
                res[idx] = temp.toString();
                temp.delete(0, temp.length());
                count = 0;
                idx++;
            }
        }
        System.out.println(Arrays.toString(res));


































        // double len = Math.ceil(s.length()/(double)k);
        // String[] res = new String[(int)len]; 
        // int count = 0,idx = 0;
        // String str = "";

        // for(int i=0; i<s.length(); i++) {
        //     str += s.charAt(i);
        //     count++;
        //     if(count == k) {
        //         res[idx] = str; 
        //         idx++;;
        //         count = 0;
        //         str = "";
        //     }
        // }

        // if(str != ""){
        //     while (str.length() != k) {
        //         str += fill;
        //     }
        //     res[res.length-1] = str;
        //     System.out.println(Arrays.toString(res));
        // } else {
        //     System.out.println(Arrays.toString(res));
        // }
    }
}
