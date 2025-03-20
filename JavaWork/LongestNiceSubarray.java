//2401. Longest Nice Subarray

public class LongestNiceSubarray {
    public static void main(String[] args) {
        //nums = [1,3,8,48,10]
        int nums[] = {1,3,8,48,10};
        //sliding window approach
        int start = 0, max = 0, bitMask = 0, n = nums.length;
        for(int i=0; i<n; i++) {
         //shrinking 
         while((bitMask & nums[i]) != 0) {
             bitMask = bitMask ^ nums[start];
             start++;
         }
         //expanding
         bitMask = bitMask | nums[i];
         max = Math.max(max, i-start+1);
        }
        System.out.println(max);
    }
}
