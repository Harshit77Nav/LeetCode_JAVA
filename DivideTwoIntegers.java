// 29. Divide Two Integers

public class DivideTwoIntegers {
    public static void main(String[] args) {
        // dividend = 7, divisor = -3

        long dividend = -2147483648L;
        int divisor = -1;
        // int count = 0;
        // long multiple = 0L; 
        // while (dividend != 0) {
        //     if(Math.abs(multiple+divisor) <= Math.abs(dividend)){
        //         multiple = multiple + divisor;
        //         count++;
        //     } else {
        //         break;
        //     }
        // }
        // if(divisor < 0 && dividend < 0){
        //     System.out.println(count);
        // } else if(divisor < 0 || dividend < 0) {
        //     System.out.println(-count);
        // } else {
        //     System.out.println(count);
        // }
        int count = 0;
        long multiple = 0L; 
        while (dividend != 0) {
            if(Math.abs(multiple+divisor) <= Math.abs(dividend)){
                multiple = multiple + divisor;
                count++;
            } else {
                break;
            }
        }
        if(dividend>Integer.MAX_VALUE){
            System.out.println(Integer.MAX_VALUE);
        } else if(dividend<=Integer.MIN_VALUE) {
            System.out.println(Integer.MIN_VALUE);
        }
        if(divisor < 0 && dividend < 0){
            System.out.println(count);
        } else if(divisor < 0 || dividend < 0) {
            System.out.println(-count);
        } else {
            System.out.println(count);
        }
        
    }
}
