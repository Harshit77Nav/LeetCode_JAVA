//1636. Sort Array by Increasing Frequency
import java.util.*;

public class SortArraybyIncreasingFrequency {
    public static void main(String[] args) {
        //nums = [-1,1,-6,4,5,-6,1,4,1]
        int nums[] = {-1,1,-6,4,5,-6,1,4,1};
        Map<Integer, Integer> mp = new HashMap<>();

        for(int i=0; i<nums.length; i++)
            mp.put(nums[i],mp.getOrDefault(nums[i], 0)+1);
        
        Integer temp[] = new Integer[nums.length];
        for(int i=0; i<nums.length; i++) {
            temp[i] = nums[i];
        }

        Arrays.sort(temp, new Comparator<Integer>(){
            public int compare(Integer a, Integer b) {
                if(mp.get(a) == mp.get(b)){
                    return b-a; // decreasing order  
                } else {
                    return mp.get(a) - mp.get(b); // increasing order
                }
            }
        });

        for(int i=0; i<nums.length; i++) {
            nums[i] = temp[i];
        }

        System.out.println(Arrays.toString(nums));

        // Map<Integer, Integer> sortedMap = mp.entrySet().stream()
        // .sorted(Map.Entry.comparingByValue())
        // .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(e1,e2) -> e2, LinkedHashMap::new));

        // int res[] = new int[nums.length];
        // int k = 0;
        // for(Map.Entry<Integer, Integer> entry : sortedMap.entrySet()) {
        //     for(int i=0; i<entry.getValue(); i++) {
        //         res[k++] = entry.getKey();
        //     }
        // }
        // System.out.println(Arrays.toString(res));
    }
}
