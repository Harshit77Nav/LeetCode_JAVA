// 34. Find First and Last Position of Element in Sorted Array
import java.util.*;

public class FindFirstandLastPositionofElementinSortedArray {
    public static void main(String[] args) {
        //nums = [5,7,7,8,8,10], target = 8
        int nums[] = {1,1,2}, target = 1;

        int left = 0, right = nums.length-1;

        while (left <= right) {
            int mid = (left+right)/2;
            System.out.println(mid);
            if(nums[mid] == target) {  
                int first = mid, last = mid;
                int[] res = getFirstnLast(first,last, nums, target);
                System.out.println(Arrays.toString(res));
                break;
            } else if(nums[mid] > target) {
                right = mid-1;
            } else if(nums[mid] < target) {
                left = mid+1;
            }
        }
    }
    public static int[] getFirstnLast(int f, int l, int[] nums, int target) {
        while (f-1 >= 0 && nums[f-1] == target || l+1 < nums.length && nums[l+1] == target) {
            if(f-1 >= 0 && nums[f-1] == target) {
                f--;
            }
            if(l+1 < nums.length && nums[l+1] == target) {
                l++;
            }
        }
        int res[] = {f,l};
        return res;
    }
}
