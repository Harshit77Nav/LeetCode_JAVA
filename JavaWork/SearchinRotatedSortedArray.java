//33. Search in Rotated Sorted Array
import java.util.*;

public class SearchinRotatedSortedArray {
    public static void main(String[] args) {
        //nums = [4,5,6,7,0,1,2], target = 0
        int nums[] = {4,5,6,7,0,1,2}, target = 0;

        int res = searchTarget(nums, target, 0, nums.length-1);
        System.out.println(res);
    }

    public static int searchTarget(int arr[], int target, int left, int right) {
        if(left > right)
            return -1;
        
        int mid = left + ((right-left)/2);  // Avoid overFlow, same as (left+right)/2
        if(arr[mid] == target)
         return mid; // Found

        if(arr[mid] >= arr[left]) {  //if left half is sorted

            if(arr[left] <= target && target <= arr[mid]){
                return searchTarget(arr, target, left, mid-1);
            } else {
                return searchTarget(arr, target, mid+1, right);
            }

        } else { // if right half is sorted 
            
            if(arr[mid] <= target && target <= arr[right]) {
                return searchTarget(arr, target, mid+1, right);
            } else {
                return searchTarget(arr, target, left, mid-1);
            }
            
        }
    }

}
