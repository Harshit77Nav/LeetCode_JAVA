// import java.util.*;

import java.util.HashMap;
import java.util.Map;

public class tempFile {
    public static void main(String[] args) {
        // nums = [1,2,3]
        int input[] = {2,1,2};
        for(int i=0; i<input.length; i++) {
            for(int j=0; j<input.length-1-i; j++) {
                if(input[j] > input[j+1]){
                    int temp = input[j];
                    input[j] = input[j+1];
                    input[j+1] = temp;
                }
            }
        }
        int res = 0;
        for(int i=input.length-1; i>1; i--) {
            int sum = input[i-1] + input[i-2];
            if(sum > input[i]) {
                int peri = sum + input[i];
                res = Math.max(res, peri);
            }
        }
        System.out.println(res);

    }
}