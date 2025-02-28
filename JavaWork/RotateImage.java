// 48. Rotate Image

import java.util.Arrays;

public class RotateImage {
    public static void main(String[] args) {
        // matrix = [[1,2,3],[4,5,6],[7,8,9]]
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] res = new int[matrix.length][matrix.length];
        int len = matrix.length;
        for(int i=0; i<len; i++ ) {
            int k = 0;
            for(int j=len-1; j>=0; j--) {
                res[i][k] = matrix[j][i];
                k++;
            }
        }
        System.out.println(Arrays.deepToString(res));
    }
}
