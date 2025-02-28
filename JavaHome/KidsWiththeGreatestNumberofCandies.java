// 1431. Kids With the Greatest Number of Candies
import java.util.*;

public class KidsWiththeGreatestNumberofCandies {
    public static void main(String[] args) {
        // candies = [2,3,5,1,3], extraCandies = 3
        int candies[] = {12,1,12}, extraCandies = 10;
        List<Boolean> res = new ArrayList<>();
        int max = 0;
        for(int num : candies) {
            if(num > max) max = num;
        }
        
        for(int i=0; i<candies.length; i++) {
            int temp = candies[i] + extraCandies;
            if(temp >= max) {
                res.add(true);
            } else {
                res.add(false);
            }
        }
        System.out.println(res);
    }
}
