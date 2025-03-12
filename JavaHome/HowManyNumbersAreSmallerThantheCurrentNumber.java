// 1365. How Many Numbers Are Smaller Than the Current Number
import java.util.*;

public class HowManyNumbersAreSmallerThantheCurrentNumber {
    public static void main(String[] args) {
        int nums[] = {8,1,2,2,3};
        int res[] = new int[nums.length];
        int temp[] = Arrays.copyOf(nums, nums.length);
        Map<Integer, Integer> mp = new HashMap<>();
        Arrays.sort(temp);
        for(int i=0; i<temp.length; i++) {
            if(!mp.containsKey(temp[i]))
                mp.put(temp[i] , i);
        }
        
        for(int i=0; i<nums.length; i++) {
            int idx = mp.get(nums[i]);
            res[i] = idx;
        }
        System.out.println(Arrays.toString(res));
    }
}
