//1572. Matrix Diagonal Sum
import java.util.*;

public class MatrixDiagonalSum {
    public static void main(String[] args) {
        /*
         * mat = [[1,1,1,1],
              [1,1,1,1],
              [1,1,1,1],
              [1,1,1,1]]
         */
        int mat[][] = {{5}};

         int res = 0;
         int n = mat.length-1;
         for(int i=0; i<mat.length; i++) {
            res += mat[i][i] + mat[i][n-i];
         }

         if(n%2 == 0){
            int mid = mat.length/2;
            res -= mat[mid][mid];
         }
         System.out.println(res);
    }
}
