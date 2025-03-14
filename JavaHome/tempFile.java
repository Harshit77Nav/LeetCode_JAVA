// import java.util.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class tempFile {
    public static void main(String[] args) {
        // nums = [1,2,3]
        int nums[] = {-100,-98,-1,2,3,4};
        int prod = 1;
        int n = nums.length;
        Arrays.sort(nums);
        int p1 = nums[0] * nums[1];
        int p2 = nums[n-1] * nums[n-2];
        if(p2 > p1) {
            if(nums[n-3] > nums[0]) {
                p2 *= nums[n-3];
            } else {
                p2 *= nums[0];
            }
            prod = p2;
        } else {
            if(nums[2] > nums[n-1]) {
                p1 *= nums[2];
            } else {
                p1 *= nums[n-1];
            }
            prod = p1;
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(prod);

    }
}