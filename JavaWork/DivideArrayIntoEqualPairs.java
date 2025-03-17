// 2206. Divide Array Into Equal Pairs
import java.util.*;

public class DivideArrayIntoEqualPairs {
    public static void main(String[] args) {
        //nums[] = {3,2,3,2,2,2};
        int nums[] = {3,2,3,2,2,2};;
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            mp.put(nums[i], mp.getOrDefault(nums[i], 0)+1);
        }
        
        for(Map.Entry <Integer, Integer> entry : mp.entrySet()) {
            if(entry.getValue() % 2 != 0) 
                System.out.println(false);
        }
        System.out.println(true);
    }
}
