//832. Flipping an Image
import java.util.*;

public class FlippinganImage {
    public static void main(String[] args) {
        // image = [[1,1,0],[1,0,1],[0,0,0]]
        int image[][] = {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};

        int res[][] = new int[image.length][image[0].length];

        for(int i=0; i<image.length; i++) {
            int k=0;
            for(int j=image[i].length-1; j>=0; j--) {
                res[i][k] = image[i][j]==1?0:1;
                k++;
            }
        }


        System.out.println(Arrays.deepToString(res));
    }
}
