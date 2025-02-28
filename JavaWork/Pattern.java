public class Pattern {
    public static void main(String[] args) {
        // for(int i=0; i<4; i++){               //square
        //     for(int j=0; j<5; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println("");
        // }

        // int n = 4;
        // int m = 5;
        // for(int i=1; i<=m; i++){               // hollow rectangle
        //     for(int j=1; j<=n; j++){
        //         if(i == 1 || j == 1 || i == m || j == n){
        //             System.out.print("*");
        //         } else {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println("");
        // }

        // int n = 4;
        // int m = 4;
        // for(int i=1; i<=m; i++){                    //half pyramid
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println("");
        // }

        // int n = 4;
        // int m = 4;
        // for(int i=0; i<m; i++){                       // inverted half pyramid
        //     for(int j=0;j<(n-i);j++){
        //         System.out.print("*");
        //     }
        //     System.out.println("");
        // }

        // int n = 4;                                    // inverted half pyramid rotated by 180deg
        // int m = 4;
        // for(int i=0; i<m; i++){
        //     for(int j=0; j<n; j++){
        //         if(j >= (n-i-1)){
        //             System.out.print("*");
        //         } else {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println("");
        // }

        // int n = 5;                               // Half pyramid with Numbers
        // int m = 5;
        // for(int i=1; i<=m; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print(j);
        //     }
        //     System.out.println("");
        // }

        // int n=5, m=5;                           // inverted hafl pyramid with numbers
        // for(int i=m; i>=1; i--){
        //     for(int j=1; j<=i; j++){
        //         System.out.print(j);
        //     }
        //     System.out.println("");
        // }

        // int n=5, m =5, k =1;                   // Flyod's triangle
        // for(int i=1; i<=m; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print(k+" ");
        //         k++;
        //     }
        //     System.out.println("");
        // }

        // int n=5, m=5, k=0;                       // 0-1 triangle

        // for(int i=1; i<=m; i++){
        //     k= i%2==0?0:1;
        //     for(int j=1; j<=i; j++){
        //         System.out.print(k);
        //         k = k==1?0:1;
        //     }
        //     System.out.println("");
        // }

        // int n = 4;                             // butterfly shape
        // int i = 1;
        // boolean flag = false;
        // while(i!=0){
        //     for(int j=1; j<=(n*2); j++){                                   
        //         if(j<=i){
        //             System.out.print("*");
        //         } else if(j>(n*2)-i){
        //             System.out.print("*");
        //         } else {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println("");
        //     if(i == n && !flag){
        //         flag = true;
        //     } else if(flag) {
        //         i--;
        //     } else {
        //         i++;
        //     }
        // }
        // *      *
        // **    **
        // ***  ***
        // ********
        // ********
        // ***  ***
        // **    **
        // *      *

        // int n = 5;
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j <=(n*2)-i; j++){
        //         if(j<=(n-i)){
        //             System.out.print(" ");
        //         } else {
        //             System.out.print("*");
        //         }
        //     }
        //     System.out.println("");
        // }
        //      *****
        //     *****
        //    *****
        //   *****
        //  *****

        // int n = 5;
        
        // for(int i=1; i<=n; i++){
        //     String str = "";
        //     for(int j=1; j<=n; j++){
        //         if(j<=n-i){
        //             System.out.print(" ");
        //         } else {
        //             str = str+i+" ";
        //         }
        //     }
        //     System.out.println(str);
        // }
        //      1 
        //     2 2
        //    3 3 3
        //   4 4 4 4
        //  5 5 5 5 5

        // int n = 5;

        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=n; j++){
        //         if()
        //     }
        // }

        String s = "leetcode";
        int k = 2;
        String str = "";
        char[] charr = {};
        for(int i=0; i<s.length(); i++){
            int ch  = s.charAt(i)-96;
            str = str+ch;
            charr = str.toCharArray();
        }

        for(int i=1; i<=k; i++){
            int sum = 0;
            for(int j=0; j<charr.length; j++){
                sum = sum + Integer.parseInt(String.valueOf(charr[j]));
            }
            // System.out.println(sum);
            charr = String.valueOf(sum).toCharArray();
        }
        System.out.println(charr instanceof char[]);
    }
}
