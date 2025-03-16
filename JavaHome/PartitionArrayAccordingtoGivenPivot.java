//2161. Partition Array According to Given Pivot
import java.util.*;

public class PartitionArrayAccordingtoGivenPivot {
    public static void main(String[] args) {
        //nums = [9,12,5,10,14,3,10], pivot = 10
        int nums[] = {-3,4,3,2}, pivot = 2;
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        int pivotCount = 0; 
        for(int i=0; i<nums.length; i++) {
            if(nums[i] < pivot) {
                left.add(nums[i]);
            } 
            if(nums[i] > pivot) {
                right.add(nums[i]);
            }
            if(nums[i] == pivot) 
                pivotCount++;
        }
        for(int i=0; i< pivotCount; i++){
            left.add(pivot);
        }
        int res[] = new int[nums.length];
        if(left.size() != 0){
        for(int i=0; i<left.size(); i++) {
            res[i] = left.get(i);
        }
    }
        int n = left.size();
        if(right.size() != 0){
        for(int i=0; i<right.size(); i++) {
            res[n+i] = right.get(i);
        }
    }
        System.out.println(Arrays.toString(res));
    }
}
