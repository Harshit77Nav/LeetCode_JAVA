import java.util.*;

public class containsDuplicates {
    public static void main(String[] args) {
        // nums = [1,2,3,1]
        int nums[] = {1,2,3,4};
        Set <Integer> set = new HashSet<>();

        for(int i=0; i<nums.length; i++) {
            if(!set.contains(nums[i])){
                set.add(nums[i]);
            } else {
                System.out.println(true);
                break;
            }
        }
        System.out.println(false);
    }
}
