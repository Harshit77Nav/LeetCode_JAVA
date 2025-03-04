// 217. Contains Duplicate ............................................................................................................................

import java.util.*;;

public class ContainsDuplicate217 {
    public static void main(String[] args) {
        int candidates[] = {2,3,6,7}, target = 7;
       List<List<Integer>> comb = new ArrayList<>();
       getCombination(0, candidates, new ArrayList<>(), comb, target);
       System.out.println(comb.toString());
    }

    static void getCombination (int start,int[] nums, List<Integer> current, List<List<Integer>> comb,int target) {
        if(target == 0){
            comb.add(new ArrayList<>(current));
        }
        if(target < 0){
            return;
        }

        for(int i=start; i<nums.length; i++){
            current.add(nums[i]);
            getCombination(i, nums, current, comb, target-nums[i]);
            current.remove(current.size()-1);
        }
    }
}
// .....................................................................................................................................................


// 219. Contains Duplicate II

// import java.util.*;

// public class ContainsDuplicate {
//     public static void main(String[] args) {
//      // nums = [1,2,3,1], k = 3
//      int nums[] = {1,2,3,1}, k = 3;

//      Map <Integer,Integer> map = new HashMap<>();
     
//      for(int i=0; i<nums.length; i++){
//         if(map.containsValue(nums[i])){
            
//         }
//      }
//     }
// }
