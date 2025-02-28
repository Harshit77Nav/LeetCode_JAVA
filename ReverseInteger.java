// 7. Reverse Integer (M)

public class ReverseInteger {
    public static void main(String[] args) {
        // x = -123
        int x = 1235555551;
        int res = 0;
        while(x != 0) {
            int temp =  x%10;
            if(res > Integer.MAX_VALUE/10 || res < Integer.MIN_VALUE/10) {
                System.out.println(0);
                break;
            }
            res = res*10 + temp;
            x = x/10;
        }
        System.out.println(res);
        
        
    }
}


























































// int x = 1000000045;
//         int num = 0;
//         while (x != 0) {
//             int temp = x%10;
//             if(num > Integer.MAX_VALUE/10 || num < Integer.MIN_VALUE/10) {
//                 System.out.println(0);
//                 break;
//             }
//             num = num*10 + temp;
//             x = x/10;
//         }
//         System.out.println(num);