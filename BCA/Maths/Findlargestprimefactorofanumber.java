// Find largest prime factor of a number //    263. Ugly Number
package BCA.Maths;

public class Findlargestprimefactorofanumber {
    public static void main(String[] args) {
        // n = 6;
        int n = 49;
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
        if(max > 5){
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        System.out.println(max);

    }
}