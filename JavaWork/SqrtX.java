// 69. sqrt(x)

public class SqrtX {
    public static void main(String[] args) {
        //n=8
        long n = 2147395599;
        long res = 1;
        long low = 1;
        long high = n;
        while (low<=high) {
            long mid = (low + high)/2;
            if((mid * mid) <= n){
                res = mid;
                low = mid + 1;
            } else {
                high = mid-1;
            } 
        }
        System.out.println(res);
    }
}
