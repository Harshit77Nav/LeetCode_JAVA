// 70. Climbing Stairs

public class ClimbingStairsLeetcode {
    public static void main(String[] args) {
        // n=2;
        int n=2;
        int bi = 0;
        int count = 0;
        getsteps(0, bi, count, 0, n);
        System.out.println(count);
    }

    public static void getsteps(int index, int bi, int count, int temp, int n) {
        if(temp == n) {
            count++;
            return;
        }
        if(temp > n) {
            return;
        }

        for(int i=index; i<n; i++) {
            if(bi == 0) {
                
            }
        }
        
    }
}
