// 347. Squares of a Sorted Array
import java.util.*;

public class SquaresofaSortedArray {
    public static void main(String[] args) {
        //nums = [-4,-1,0,3,10]
        int input[] = {-4,-1,0,3,10};
        int res[] = new int[input.length];
        int left = 0, right = input.length-1, i = input.length-1;
        while (left <= right) {
            if(Math.abs(input[left]) > Math.abs(input[right])) {
                res[i] = input[left]*input[left];
                left++;
            } else {
                res[i] = input[right]*input[right];
                right--;
            }
            i--;
        }
        // return res;
        System.out.println(Arrays.toString(res));
    }
}
//......................................WIP