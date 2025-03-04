//2595. Number of Even and Odd Bits

import java.util.Arrays;

public class NumberofEvenandOddBits {
    public static void main(String[] args) {
        // n=50;
        int n = 50;
        String binary = Integer.toBinaryString(n);
        int res[] = new int[2]; 
        int even = 0, odd = 0;
        for(int i=binary.length()-1, j = 0; i>=0; i--, j++){
            if((j&1)==0 && binary.charAt(i) == '1') 
                even++;
             else if(binary.charAt(i) == '1') 
                odd++;
        }
        res[0] = even; res[1] = odd;
        System.out.println(Arrays.toString(res));
    }
}
