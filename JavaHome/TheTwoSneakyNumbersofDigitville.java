// 3289. The Two Sneaky Numbers of Digitville (E)
import java.util.*;

public class TheTwoSneakyNumbersofDigitville {
    public static void main(String[] args) {
        // nums = [0,1,1,0]
        int nums[] = {0,1,1,0};

        Map<Integer, Integer> myMap = new HashMap<>();
        int res[] = new int[2];
        int k = 0;
        for(int i=0; i<nums.length; i++) {
            if(myMap.containsKey(nums[i])) {
                res[k] = nums[i];
                k++;
            } else {
                myMap.put(nums[i], 1);
            }
        }   
        System.out.println(Arrays.toString(res));
    }
}
