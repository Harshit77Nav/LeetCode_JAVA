// 219. Contains Duplicate II
import java.util.*;

public class ContainsDuplicateII {
    public static void main(String[] args) {
        // nums = [1,2,3,1], k = 3
        int nums[] = {1,2,3,1,2,3} ,  k=2;
        Map<Integer, String> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){

            if(map.containsKey(nums[i])){
                String strArr[] = map.get(nums[i]).split(" ");
                for(int j=0; j<strArr.length; j++){
                    int temp = Integer.parseInt(strArr[j]);
                    if(Math.abs(i - temp) <= k){
                        System.out.println(true);
                    }
                }
            }

            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+" "+i);
            } else {
                map.put(nums[i], i+"");
            }
        }

        // for(int i=0; i<nums.length; i++){
        //     if(map.containsKey(nums[i])){
        //         String strArr[] = map.get(nums[i]).split(" ");
        //         for(int j=0; j<strArr.length; j++){
        //             int temp = Integer.parseInt(strArr[j]);
        //             if(Math.abs(temp - j) <= k){
        //                 System.out.println(Math.abs(temp - j));
        //             }
        //         }
        //     }
        // }
        System.out.println(map);
        
        



















        // for(int i=0; i<nums.length; i++){

        //     for(int j=i+1; j<nums.length; j++){
        //         if(nums[i]==nums[j] && Math.abs(i-j) <= k){
        //             System.out.println(true);
        //         }
        //     }
        // }
        // System.out.println(false);
    }
}
