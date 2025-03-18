// 70. Climbing Stairs
import java.util.*;

public class ClimbingStairs {
    public static void main(String[] args) {
        //n = 3 //3
        int n = 5;
        if(n == 1)
            System.out.println(1);
        else if (n == 2) 
            System.out.println(2);
        
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
            for(int i=2; i<n; i++) {
                list.add(list.get(i-2)+list.get(i-1));
            }
        System.out.println(list.get(list.size()-1));

    }
}
