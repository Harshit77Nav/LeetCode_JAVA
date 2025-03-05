// Find largest prime factor of a number //    263. Ugly Number //All prime factors
package BCA.Maths;

import java.util.*;

public class Findlargestprimefactorofanumber {
    public static void main(String[] args) {
        // n = 6;
        int n = 16;
        int max = -1;
        List<Integer> res = new ArrayList<>();

        while((n&1) == 0) {
            res.add(2);
            max = 2;
            n >>= 1;
        }
        
        for(int i=3; i*i<=n; i+=2) {
            while(n%i == 0) {
                res.add(i);
                max = i;
                n = n/i;
            }
        }
        if(n > 1) {
            res.add(n);
            max = n;
        }
        //.......................................
        System.out.println(res);
        int output[] = new int[res.size()];
        for(int i=0; i<res.size(); i++){
            output[i] = res.get(i);
        }
        //.......................................
        if(max > 5){
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        System.out.println(max);

    }
}