//867. Transpose Matrix
import java.util.*;

public class TransposeMatrix {
    public static void main(String[] args) {
        //matrix = [[1,2,3],[4,5,6],[7,8,9]]
        int[][] matrix = {{1,2,3},{4,5,6}};
        int[][] res = new int[matrix[0].length][matrix.length];
        for(int i=0; i<matrix[0].length; i++) {

            for(int j=0; j<matrix.length; j++) {
                res[i][j] = matrix[j][i];
            }
        }
        System.out.println(Arrays.deepToString(res));
    }
}
