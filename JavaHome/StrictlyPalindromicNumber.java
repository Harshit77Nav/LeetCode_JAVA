// 2396. Strictly Palindromic Number

public class StrictlyPalindromicNumber {
    public static void main(String[] args) {
        // n = 9;
        int n = 9;

        for(int i=2; i<=n-2; i++) {
            StringBuilder temp = new StringBuilder(Integer.toString(n,i));
            StringBuilder rev = new StringBuilder();

            for(int  j=temp.length()-1; j>=0; j--) {
                rev.append(temp.charAt(j));
            }
            
            if(rev.toString().equals(temp.toString())) {
                continue;
            } else {
                System.out.println(false);
                break;
            }
        }
    }
}
