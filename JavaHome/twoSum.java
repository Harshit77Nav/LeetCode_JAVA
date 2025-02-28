import java.util.*;

public class twoSum {
    public static void main(String[] args) {
        // nums = [2,7,11,15], target = 9
        int nums[] = {2,7,11,15}, target = 9;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length; i++){
            int otherNum = target - nums[i];
            if(map.containsKey(otherNum)){
                int[] result = {map.get(otherNum), i};
                System.out.println(Arrays.toString(result));
                //return result;
                //return new int[] {map.get(otherNum), i};
                
            } else {
                map.put(nums[i],i);
            }
        }
             //return null   
    }
}
