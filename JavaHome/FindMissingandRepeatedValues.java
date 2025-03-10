// 2965. Find Missing and Repeated Values
import java.util.*;

public class FindMissingandRepeatedValues {
    public static void main(String[] args) {
        //grid = [[1,3],[2,2]]
        int grid[][] = {{1,3},{2,2}};
        Map<Integer, Integer> myMap = new HashMap<>();
        for(int i=0; i<grid.length; i++) {
            for(int j=0; j<grid[i].length; j++) {
                myMap.put(grid[i][j], myMap.getOrDefault(grid[i][j], 0)+1);
            }
        }
        int n = grid.length;
        int res[] = new int[2];
        for(int i=1; i<=n*n; i++) {
            if(myMap.containsKey(i) && myMap.get(i) == 2)
                res[0] = i;
            else if(!myMap.containsKey(i)) 
                res[1] = i;
        }
        System.out.println(Arrays.toString(res));
    }    
}
