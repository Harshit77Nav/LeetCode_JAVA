// 3191.Minimum Operations to Make Binary Array Elements Equal to One I

public class MinimumOperationstoMakeBinaryArrayElementsEqualtoOneI {
    public static void main(String[] args) {
        //nums = [0,1,1,1,0,0];
        int nums[] = {0,1,1};
        int count = 0;
        boolean flag = false;
        for(int i=0; i<nums.length-2; i++) {
            if(nums[i] == 0) {
                nums[i] = 1;
                nums[i+1] = nums[i+1] == 0 ?1:0;
                nums[i+2] = nums[i+2] == 0 ?1:0;
                count++;
            }
            if(nums[i] == 1 && nums[i+1] == 1 && nums[i+2] == 1) {
                flag = true;
            } else {
                flag = false;
            }
        }
        if(flag) 
            System.out.println(count);
        else 
            System.out.println(-1);
    }
}
