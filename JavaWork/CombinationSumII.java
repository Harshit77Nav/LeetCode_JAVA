// 40. Combination Sum II

import java.util.*;

public class CombinationSumII {
    public static void main(String[] args) {
        //candidates = [10,1,2,7,6,1,5], target = 8
        int candidates[] = {10,1,2,7,6,1,5}, target = 8;
        Arrays.sort(candidates);
        List<List<Integer>> comb = new ArrayList<>();
       getCombination(0, candidates, new ArrayList<>(), comb, target);
       System.out.println(comb);
    //    return comb;
    }

    static void getCombination (int start,int[] nums, List<Integer> current, List<List<Integer>> comb,int target) {
        if(target == 0){
            comb.add(new ArrayList<>(current));
        }
        if(target < 0){
            return;
        }

        for(int i=start; i<nums.length; i++){
            if(i>start && nums[i] == nums[i-1]) continue;
            current.add(nums[i]);
            getCombination(i+1, nums, current, comb, target-nums[i]);
            current.remove(current.size()-1);
        }
    }

    // }
}
