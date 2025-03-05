// Find largest prime factor of a number
package BCA.Maths;

public class Findlargestprimefactorofanumber {
    public static void main(String[] args) {
        // n = 6;
        int n = 15;
        int max = -1;
        while((n&1) == 0) {
            max = 2;
            n >>= 1;
        }
        
        for(int i=3; i*i<=n; i+=2) {
            while(n%i == 0) {
                max = i;
                n = n/i;
            }
        }

        if(n > 1) {
            max = n;
        }
        System.out.println(max);

    }
}