// 509. Fibonacci Number

public class FibonacciNumber {
    public static void main(String[] args) {
        // n=2
        int n = 5;
        if(n==0){
            System.out.println(0);
        } else if(n==1){
            System.out.println(1);
        } else if(n>1){
            int res = fibonacciNumber(n-1) + fibonacciNumber(n-2);
            System.out.println(res);
        }
    }

    static int fibonacciNumber(int num){
        if(num==0){
            return 0;
        } else if(num==1){
            return 1;
        }else {
        return fibonacciNumber(num-1) + fibonacciNumber(num-2);
        }
    }
    
}
