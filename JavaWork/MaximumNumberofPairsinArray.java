// 2341. Maximum Number of Pairs in Array
import java.util.*;

public class MaximumNumberofPairsinArray {
    public static void main(String[] args) {
        //nums = [1,3,2,1,3,2,2]
        int nums[] = {1,3};

        Arrays.sort(nums);
        int i=0, count=0;
        while (i<nums.length-1) {
            if(nums[i] == nums[i+1]) {
                i = i+2;
                count++;
            } else {
                i++;
            }
        }
        System.out.println(count+" "+(nums.length-count*2));
    }
}
