// 53. Maximum Subarray

public class MaximumSubarray {
    public static void main(String[] args) {
        //nums = [-2,1,-3,4,-1,2,1,-5,4]
        int nums[] = {-9,-5,-7,-2,-1,-6};

        // int max = 0;
        // int sum = 0;
        // int smallest = Integer.MIN_VALUE;
        // boolean flag = false;
        // for(int i=0; i<nums.length; i++) {
        //     sum += nums[i];
        //     if(sum < 0) {
        //         sum = 0;
        //     } else {
        //         flag = true;
        //         max = Math.max(sum, max);
        //     }
        //     if(nums[i] < 0 && nums[i] > smallest) {
        //         smallest = nums[i];
        //     }
        // }
        // if(flag) {
        //     System.out.println(max);
        // } else {
        //     System.out.println(smallest);
        // }

        int sum = 0;
        int max = nums[0];

        for(int i=0; i<nums.length; i++) {
            sum += nums[i];
            max = Math.max(max, sum);
            if(sum < 0) {
                sum = 0;
            }
        }
        System.out.println(max);
    }
}
