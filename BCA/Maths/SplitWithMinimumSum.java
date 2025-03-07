// Split With Minimum Sum
package BCA.Maths;

import java.util.Arrays;

public class SplitWithMinimumSum {
    public static void main(String[] args) {
        // num = 4325
        int num = 687;
        String arr[] = Integer.toString(num).split("");
        Arrays.sort(arr);
        int num1 = 0, num2 = 0;
        for(int i=0; i<arr.length; i++) {
            if(i % 2 == 0)
                num1 = num1 * 10 + Integer.parseInt(arr[i]);
            else 
                num2 = num2 * 10 + Integer.parseInt(arr[i]);
        }
        System.out.println(num1 +" "+ num2);
    }
}
