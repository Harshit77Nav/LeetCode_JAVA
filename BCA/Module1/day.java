// import java.util.*;

import java.util.Arrays;

public class day {
    public static void main(String[] args) {
        int input1[] = {1,2,5,4,0} , input2[] = {2,4,5,0,1};
        for(int i=0; i<input1.length; i++) {
            for(int j=0; j<input1.length-1-i; j++ ) {
                if(input1[j]>input1[j+1]) {
                    int temp = input1[j];
                    input1[j] = input1[j+1];
                    input1[j+1] = temp;
                }
            }
        }
        for(int i=0; i<input2.length; i++) {
            for(int j=0; j<input2.length-1-i; j++ ) {
                if(input2[j]>input2[j+1]) {
                    int temp = input2[j];
                    input2[j] = input2[j+1];
                    input2[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(input1)+" "+Arrays.toString(input2));
        for(int i=0; i<input1.length; i++) {
            if(input1[i] != input2[i])
                System.out.println(false);
        }
        System.out.println(true);
    }
}
