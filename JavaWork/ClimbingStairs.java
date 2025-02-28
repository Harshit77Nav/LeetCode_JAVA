// 70. Climbing Stairs

public class ClimbingStairs {
    public static void main(String[] args) {
        //n = 3
        int n = 3;
        int count  = 0;
        getSteps(0, n, count, 0);
        System.out.println(count);
    }

    public static void getSteps(int index, int n, int count, int temp) {

        for(int i=index; i<n; i++) {
            temp += 1;
            
        }
    }
}
