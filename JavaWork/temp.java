// import java.util.*;

public class temp {
    public static void main(String[] args) {
        // n = 12
        // int nums[] = {4,5,6,7,0,1,2}, target = 0;
        int n = 9669;
		String str = Integer.toString(n);
        boolean flag = false;
        int res = 0;
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) == '6' && !flag) {
                res = res *10 + 9;
                flag = true;
            } else {
                res = (res * 10) + (str.charAt(i) - '0');
            }
        }
        System.out.println(res);
        
    }

}
