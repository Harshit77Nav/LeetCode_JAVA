// Count Trailing Zeroes

public class CountTrailingZeroes {
    public static void main(String[] args) {
        // n = 12;
        int n = -56;
        int count = 0;
        while (n  != 0) {
            int bit = (n&1);
            if(bit == 0) {
                count++;
            } else {
                break;
            }
            n = n >> 1;
        }
        System.out.println(count);
    }
}
