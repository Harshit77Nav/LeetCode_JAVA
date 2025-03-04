//639. Binary Number with Alternating Bits
// import java.util.*;
public class BinaryNumberwithAlternatingBits {
    public static void main(String[] args) {
        //n = 5;
        int n = 10;
        // String binary = Integer.toBinaryString(n);
        // Character temp = ' ';
        // for(int i=0; i<binary.length(); i++) {
        //     if(i == 0) {
        //         temp = binary.charAt(i);
        //     } else if(binary.charAt(i) != temp) {
        //         temp = binary.charAt(i);
        //     } else {
        //         System.out.println(false);
        //         break;
        //     }
        // }
        // System.out.println(true);

        while(n > 0) {
            int last  = (n & 1);
            n = n >> 1;
            if((n & 1) == last) {
                System.out.println(false);
            }
        }
        System.out.println(true);
    }
}
