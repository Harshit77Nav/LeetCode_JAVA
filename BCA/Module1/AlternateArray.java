package BCA.Module1;
import java.util.*;


public class AlternateArray {
    public static void main(String[] args) {
        int input[] = {7, 1, 2, 3, 4, 5, 6};
        int res[] = new int[input.length];
        for(int i=0; i<input.length; i++) {
            for(int j=0; j<input.length-1-i; j++) {
                if(input[j] > input[j+1]) {
                    int temp = input[j];
                    input[j] = input[j+1];
                    input[j+1] = temp;
                }
            }
        }
        int j = 0, k = input.length-1;
        for(int i=0; i<input.length; i++) {
            if((i&1) == 0) {
                res[i] = input[k--]; 
            } else {
                res[i] = input[j++]; 
            }
        }
        System.out.println(Arrays.toString(res));
    }
}
