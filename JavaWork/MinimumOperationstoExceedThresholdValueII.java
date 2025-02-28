//3066. Minimum Operations to Exceed Threshold Value II
import java.util.*;

public class MinimumOperationstoExceedThresholdValueII {
    public static void main(String[] args) {
        //nums = [2,11,10,1,3], k = 10
        int nums[] = {999999999,999999999,999999999}, k = 1000000000;
        PriorityQueue<Long> pq = new PriorityQueue<>();
        int n = nums.length;
        for(int i=0; i<n; i++) {
            pq.offer((long)nums[i]);
        }

        int count = 0;
        while(pq.size() > 1) {
            long first = pq.poll();
            if( first >= k ) {
                break;
            }
            long second = pq.poll();
            long add = (first*2) + second;
            pq.offer(add);
            count++;
        }
        System.out.println(count);
    }   
}
