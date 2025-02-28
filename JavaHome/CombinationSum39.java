import java.util.*;
public class CombinationSum39 {
    public static void main(String[] args) {
     // candidates = [2,3,6,7], target = 2
        int candidates[] = {2,3,6,7}, target = 7;
    List<List<Integer>> comb = new ArrayList();
    getCombination(0, candidates, new ArrayList<>(), comb, target);
    // return comb;
    for (List<Integer> innerList : comb) {
        for (Integer num : innerList) {
            System.out.print(num + " ");
        }
        System.out.print("|"); // Move to the next line after printing each inner list
    }
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
