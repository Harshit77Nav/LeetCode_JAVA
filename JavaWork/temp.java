// import java.util.*;

public class temp {
    public static void main(String[] args) {
        // n = 12
        // int nums[] = {4,5,6,7,0,1,2}, target = 0;
        int n = 13;
        if(n == 0) System.out.println(0);;
        long facto = 1;
        for(int i=1; i<=n; i++) {
            facto = facto * i;
        }
        System.out.println(facto);
        String str = Long.toString(facto);
        System.out.println(str);
        int count = 0;
        for(int i=str.length()-1; i>=0; i--) {
            if(str.charAt(i) == '0') {
                count++;
                continue;
            } else {
                break;
            }
        }
        System.out.println(count);
        
    }

}
