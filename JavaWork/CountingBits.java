//338. Counting Bits

import java.util.Arrays;

public class CountingBits {
    public static void main(String[] args) {
        // n = 5
        int n = 5;
        int res[] = new int[n+1];
        for(int i=0; i<=n; i++) {
            int count = 0;
            int num = i;
            while(num>0) {
                int bit = (num&1);
                if(bit == 1) {
                    count++;
                }
                num = num >> 1;
            }
            res[i] = count;
        }
        System.out.println(Arrays.toString(res));



        /* Optimal Solution .....................
         * 
         *int[] res = new int[n + 1];
            for (int i = 1; i <= n; i++)
                res[i] = res[i & (i-1)] + 1;
            return res;
         * 
         */
    }
}
