// 78. Subsets

import java.util.*;

public class SubSets {
    public static void main(String[] args) {
        // nums = [1,2,3]
        int nums[] = {1,2,2};
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        generateSubsets(0, nums, new ArrayList<>(), res);
        System.out.println(res.toString());
    }

    static void generateSubsets (int index, int[] nums, List<Integer> curr, List<List<Integer>> res) {
        res.add(new ArrayList<>(curr));

        for(int i=index; i<nums.length; i++){
            if(i > index && nums[i] == nums[i-1]) continue;
            curr.add(nums[i]);
            generateSubsets(i+1, nums, curr, res);
            curr.remove(curr.size()-1);
        }
    }
}
