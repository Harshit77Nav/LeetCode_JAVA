//2418. Sort the People
import java.util.*;

public class SortthePeople {
    public static void main(String[] args) {
        // names = ["Mary","John","Emma"], heights = [180,165,170]
        String names[] = {"Mary","John","Emma"};
        int heights[] = {180,165,170};
        Map<Integer, String> myMap = new HashMap<>();

        for(int i=0; i<heights.length; i++) {
            myMap.put( heights[i], names[i]);
        }
        Arrays.sort(heights);
        for(int i=heights.length-1, j=0; i>=0; i--, j++) {
            String temp = myMap.get(heights[i]);
            names[j] = temp;
        }
        System.out.println(Arrays.toString(names));
    }
}
