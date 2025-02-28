import java.util.*;

public class temp {
    public static void main(String[] args) {
        // nums = [1,2,3]

        int nums[] = {4,5,6,7,0,1,2}, target = 0;
        if(nums.length == 1 && target == nums[0]) System.out.println(0);

        int left = 0, right = nums.length-1;
        while(left < right) {
            int mid = (left + right)/2;
            if(target == nums[right]) System.out.println(right); 
            if(target == nums[left]) System.out.println(left); 
            if(target == nums[mid]) System.out.println(mid); 
            if(target > nums[left] && target < nums[mid]) {
                right = mid-1;
            } else if(target > nums[left] || target < nums[mid]) {
                right = mid-1;
            } else { 
                left = mid+1;
            }
        }
        System.out.println(-1); 
    }
}