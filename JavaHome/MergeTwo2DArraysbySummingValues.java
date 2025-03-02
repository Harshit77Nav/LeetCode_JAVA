//2570. Merge Two 2D Arrays by Summing Values (E)
import java.util.*;

public class MergeTwo2DArraysbySummingValues {
    public static void main(String[] args) {
        //nums1 = [[1,2],[2,3],[4,5]], nums2 = [[1,4],[3,2],[4,1]]
        int[][] nums1 = {{745,4},{3,6},{5,5}}, nums2 = {{732,3},{4,3}};

        Map<Integer, Integer> myMap = new HashMap<>();

        for(int i=0; i<nums1.length; i++) {
            myMap.put(nums1[i][0], nums1[i][1]);
        }
        for(int i=0; i<nums2.length; i++) {
            myMap.put(nums2[i][0], myMap.getOrDefault(nums2[i][0], 0)+nums2[i][1]);
        }
        int res[][] = new int[myMap.size()][2];
        int i=0;
        for(Map.Entry<Integer, Integer> entry : myMap.entrySet()) {
            res[i][0] = entry.getKey();
            res[i][1] = entry.getValue();
            i++;
        }
        Arrays.sort(res, (a, b) -> Integer.compare(a[0], b[0]));
        System.out.println(Arrays.deepToString(res));

    }
}