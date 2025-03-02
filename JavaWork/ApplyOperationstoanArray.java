// 2460. Apply Operations to an Array
import java.util.*;

public class ApplyOperationstoanArray {
    public static void main(String[] args) {
        //nums = [1,2,2,1,1,0]
        int nums[] = {0,1,0,0,0,5,5};
        int res[] = new int[nums.length];
        int i = 0, k = 0;
        while(i<nums.length) {
            if(i < nums.length-1 && nums[i] == nums[i+1] && nums[i] != 0){
                res[k++] = nums[i]*2;
                i = i+2;
            } else {
                if(nums[i] != 0) 
                    res[k++] = nums[i];
                i++;
            }
        }
        System.out.println(Arrays.toString(res));
        
    }
    
}