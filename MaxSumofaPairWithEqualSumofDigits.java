// 2342. Max Sum of a Pair With Equal Sum of Digits
import java.util.*;

public class MaxSumofaPairWithEqualSumofDigits {
    public static void main(String[] args) {
        //nums = [18,43,36,13,7]
        int nums[] = {243,205,369,253,72,484,300,161,188,69,309,96,226,308,252}; //479
        // output = 495;
        Map<Integer, Integer> myMap = new HashMap<>();
        int max = -1;
        for(int i=0; i<nums.length; i++) {
            int sum = 0;
            int num = nums[i];
            while (num != 0) {
                int temp = num%10;
                sum += temp;
                num /= 10;
            }

            if(myMap.containsKey(sum)) {
                int temp = nums[i] + nums[myMap.get(sum)];
                System.out.println(nums[i]+" "+nums[myMap.get(sum)]);
                max = Math.max(max,temp);
            } 
            int idx = myMap.getOrDefault(sum,0);
            if(nums[idx] > nums[i] && myMap.containsKey(sum)){
                myMap.put(sum,idx);
            } else {
                myMap.put(sum, i);
            }
        }
        System.out.println(max);
        System.out.println(nums.length);
        System.out.println(myMap);
    }
}
