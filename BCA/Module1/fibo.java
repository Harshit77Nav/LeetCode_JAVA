import java.util.Arrays;

public class fibo {

    public static void main(String[] args) {
        int n = 9;
        int[] res = new int[n];

        if(n>=0){
            res[0] = 0;
        }
        if(n>=1 && res.length > 1) {
            res[1] = 1;
        }

        for(int i=2; i<n; i++){
            int temp = res[i-1]+res[i-2];
            res[i] = temp;
        }
        System.out.println(Arrays.toString(res));
    }


    // public static void main(String[] args) {
    //     int n = 4;

    //     int res[] = new int[n];

    //      int gg =  getFibo(n);
    //      System.out.println(gg);
    // }

    // static int getFibo(int n) {
    //     if(n <= 1) {
    //         return n;
    //     }
        
    //     System.out.println(getFibo(n-2) + getFibo(n-1));
    // }
}
