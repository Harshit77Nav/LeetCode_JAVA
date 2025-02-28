// 2006. Count Number of Pairs With Absolute Difference K
import java.util.*;

public class AbsoluteDifferenceK2006 {
    public static void main(String[] args) {
        //nums = [1,2,2,1], k = 1
        int nums[] = {1,2,2,1} , k = 1;
        int count = 0;
        Map<Integer, Integer> countMap = new HashMap<>();
        for(int i=0; i<nums.length; i++){

            count += countMap.getOrDefault(nums[i] - k, 0);
            count += countMap.getOrDefault(nums[i] + k, 0);
            countMap.put(nums[i], countMap.getOrDefault(nums[i],0) + 1);

            // for(int j=i+1; j<nums.length; j++){
            //     if(i < j && Math.abs(nums[i] - nums [j]) == k){
            //         count = count + 1;
            //     }
            // }
        }
        System.out.println(count);
    }
}
