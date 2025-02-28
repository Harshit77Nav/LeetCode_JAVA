//237. Non-overlapping Intervals
import java.util.*;

public class NonoverlappingIntervals {
    public static void main(String[] args) {
        //intervals = [[1,2],[2,3],[3,4],[1,3]]
        int [][]input = {{1,2},{2,3},{3,4},{1,3}};
        int last = 0, n =input[0].length-1, curr = 0, count = 0;
        for(int i=0; i<input.length; i++) {
            if(i == 0){
                last = input[i][n];
                continue;
            }
            curr = input[i][0];
            if(last != curr){
                count++;
            }
            last = input[i][n];
        }
        System.out.println(count);
    }
}
