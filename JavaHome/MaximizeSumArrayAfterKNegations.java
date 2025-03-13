//1005. Maximize Sum Of Array After K Negations
import java.util.*;

public class MaximizeSumArrayAfterKNegations {
    public static void main(String[] args) {
        // nums = [4,2,3], k = 1
        int  nums[] = {8,-7,-3,-9,1,9,-6,-9,3}, k = 8;
        Arrays.sort(nums);
        int sum = 0, i = 0;
        while (k > 0) {
            nums[i] = -nums[i];
            if(nums.length > i+1 && nums[i] > nums[i+1]) {
                i++;
                k--;
            } else {
                k--;
            }
        }
        for(int j=0; j<nums.length; j++) {
            sum += nums[j];
        }
        System.out.println(sum);
    }
}
