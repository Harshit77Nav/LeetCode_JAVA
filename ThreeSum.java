// 3Sum
import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        // nums = [-1,0,1,2,-1,-4]
        int nums[] = {-1,0,1,2,-1,-4,-4,4,4};
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        if(nums.length < 3) {
            System.out.println(res);
        }
        for(int i=0; i<nums.length; i++) {
            int left = i+1;
            int right = nums.length-1;
            if(i>0 && nums[i] == nums[i-1]) continue;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                
                if(sum == 0) {
                    res.add(new ArrayList<>(Arrays.asList(nums[i], nums[left], nums[right])));
                    left++;
                    while (left < right && nums[left] == nums[left-1]) left++;
                } else if(sum > 0) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        System.out.println(res);
    }
}
