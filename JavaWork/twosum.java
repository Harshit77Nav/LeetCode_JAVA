import java.util.*;

public class twosum {
    public static void main(String[] args) {
        int nums[] = {3,3}, target = 6;
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            int otherNum = target - nums[i];
            if(map.containsKey(otherNum)){
                int res[] = {map.get(otherNum), i};
                System.out.println(Arrays.toString(res));
                // return result;
            } else {
                map.put(nums[i], i);
            }
        }

    }
}
