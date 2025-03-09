package BCA.Maths;
//1512. Number of Good Pairs
import java.util.*;

public class NumberofGoodPairs {
    public static void main(String[] args) {
        int nums[] =  {1,2,3,1,1,3};
        Map<Integer, Integer> myMap = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            myMap.put(nums[i], myMap.getOrDefault(nums[i], 0)+1);
        }
        int total = 0;
        for(Map.Entry<Integer, Integer> entry : myMap.entrySet()) {
            int n = entry.getValue();
            if(n >= 2) {
                int sum = (n*(n-1))/2;
                total += sum;
            }
        }
        System.out.println(total);
    }
}
