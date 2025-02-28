import java.util.*;
public class MajorityElement169 {
    public static void main(String[] args) {
        //nums = [2,2,1]

        int nums[] = {5,5,6,6,6,6};
        Arrays.sort(nums);
        System.out.println(nums[nums.length/2]);
    }
}
