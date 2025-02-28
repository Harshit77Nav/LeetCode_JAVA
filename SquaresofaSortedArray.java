// 347. Squares of a Sorted Array
import java.util.*;

public class SquaresofaSortedArray {
    public static void main(String[] args) {
        //nums = [-4,-1,0,3,10]
        int nums[] = {-4,-1,0,3,10};
        int res[] = new int[nums.length];
        int idx = -1;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] >= 0 ) {
                idx = i;
                break;
            }
        }
        int i = idx, j = idx, k = 0;
        boolean flag = false;
        while (i >= 0 || j < nums.length ) {
            int sq1 = 0, sq2 = 0;
            if(i-1 >= 0 && sq1 == 0) {
                i--;
                sq1 = nums[i] * nums[i];
                flag = false;
            }
            if(j+1 < nums.length && sq2 == 0 && flag) {
                
                j++;
                sq2 = nums[j] * nums[j];
            }
            if(sq1 < sq2) {
                res[k] = sq1;
                k++;
            }
        }
    }
}
//......................................WIP