import java.util.*;

public class day3 {
    public static void main(String[] args) {
        int[] nums = {3,4,5,2};
        int max = 0;
        for(int i=0; i<nums.length; i++) {
            for(int j=i; j<nums.length; j++) {
                if(i == j) continue;
                int temp = (nums[i]-1) * (nums[j]-1);
                System.out.println(temp+" "+i+" "+j);
                max = Math.max(temp, max);
            }
        }
        System.out.println(max);
    }
}
