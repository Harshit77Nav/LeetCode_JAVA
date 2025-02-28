// 46. Permutations
import java.util.*;

public class Permutations46 {
    public static void main(String[] args) {
        //  nums = [1,1,2]
        int nums[] = {1,2,3};
        List<List<Integer>> res = new ArrayList<>();
        getPermutation(0, nums, new ArrayList<>(), res);  
        System.out.println(res);
    }

    static void getPermutation(int index,int[] nums,List<Integer> list,List<List<Integer>> res){
        if(list.size() == nums.length){
            res.add(new ArrayList<>(list));
        } else if(list.size() > nums.length) {
            return;
        }

        for(int i=0; i<nums.length; i++){
            if(list.contains(nums[i])) continue;
            list.add(nums[i]);
            getPermutation(index+1, nums, list, res);
            list.remove(list.size()-1); 
        }
    }
}
