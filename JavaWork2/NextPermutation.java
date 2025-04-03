package JavaWork2;
import java.util.*;

public class NextPermutation {
    public static void main(String[] args) {
        // [1,2,3]
        int nums[] = { 1, 5, 1};
        int i = nums.length - 2;
        while (i >= 0 && nums[i] >= nums[i + 1])
            i--;
        if (i >= 0) {
            int j = nums.length - 1;
            while (j >= 0 && nums[j] <= nums[i])
                j--;
            swap(nums, i, j);
        }
        rev(nums, i + 1);
        System.out.println(Arrays.toString(nums));
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void rev(int[] nums, int start) {
        int end = nums.length - 1;
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    // generating all permutation brute force
    // public static void main(String[] args) {
    // //[1,2,3]
    // int nums[] = {3,2,1};
    // int temp[] = Arrays.copyOf(nums, nums.length);
    // Arrays.sort(temp);
    // List<List<Integer>> list = new ArrayList<>();
    // getPer(0, list, temp, new ArrayList<>());
    // String str = Arrays.toString(nums);
    // for(int i=0; i<list.size(); i++) {
    // String str2 = list.get(i).toString();
    // if(str.equals(str2) && i != list.size()-1){
    // System.out.println(list.get(i+1));
    // break;
    // } else {
    // System.out.println(list.get(0));
    // break;
    // }
    // }
    // }

    // public static void getPer(int index, List<List<Integer>> list, int nums[],
    // List<Integer> curr) {
    // if(curr.size() == nums.length){
    // list.add(new ArrayList<>(curr));
    // return;
    // }
    // for(int i=0; i<nums.length; i++) {
    // if(curr.contains(nums[i])) continue;
    // curr.add(nums[i]);
    // getPer(i+1, list, nums, curr);
    // curr.remove(curr.size()-1);
    // }
    // }
}
