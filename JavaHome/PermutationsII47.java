// 47. Permutations II
import java.util.*;

public class PermutationsII47 {
    public static void main(String[] args) {
        // nums = [1,1,2]
        int nums[] = {1,1,3};
        List<List<Integer>> res = new ArrayList<>();
        getPermutation(0, nums, new ArrayList<>(), res);
        System.out.println(res);
    }

    static void getPermutation(int index, int[] nums, List<Integer> list, List<List<Integer>> res){
        if(list.size() == nums.length){
            res.add(new ArrayList<>(list));
        } else if(list.size() > nums.length){
            return;
        }

        for(int i=index; i<nums.length; i++){
            // if(list.contains(nums[i])) continue;
            if(i > index && nums[i] == nums[i-1]) continue;
            list.add(nums[i]);
            getPermutation(index, nums, list, res);
            list.remove(list.size()-1);
        }
    }
}
