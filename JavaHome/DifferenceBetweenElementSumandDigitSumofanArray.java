// 2535. Difference Between Element Sum and Digit Sum of an Array

public class DifferenceBetweenElementSumandDigitSumofanArray {
    public static void main(String[] args) {
        //nums = [1,15,6,3]
        int nums[] = {1,2,3,4};
        int sum1 = 0, sum2 = 0;
        for(int i=0; i<nums.length; i++) {
            int temp = 0;
            if(nums[i] > 9) {
                temp = getSum(nums[i]);
                sum2 += temp;
            } else {
                sum2 += nums[i];
            }
            sum1 += nums[i];
        }
        System.out.println(Math.abs(sum2 - sum1));
    }

    public static int getSum(int n) {
        int sum = 0;
        while (n != 0) {
            sum += (n%10);
            n /= 10;
        }
        return sum;
    }
}
