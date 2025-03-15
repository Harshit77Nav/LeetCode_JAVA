// 977. Squares of a Sorted Array
import java.util.*;

public class SquaresOfaSortedArray {
    public static void main(String[] args) {
        //nums = [-4,-1,0,3,10]
        int nums[] = {-7,-3,2,3,11};

        int res[] = new int[nums.length];
        int left = 0, right = nums.length-1, i = nums.length-1;
        while (left <= right) {
            if(Math.abs(nums[left]) > Math.abs(nums[right])) {
                res[i] = nums[left]*nums[left];
                left++;
            } else {
                res[i] = nums[right]*nums[right];
                right--;
            }
            i--;
        }
        System.out.println(Arrays.toString(res));
    }
}
