public class Appjava {
    public static void main(String[] args) {
        // Boolean k = true;
        int n = 153;
        int num = n;
        int res = 0;
        int len = Integer.toString(n).length();
        while (n != 0) {
            int temp = n%10;
            res += Math.pow(temp, len);
            n = n/10;
        }
        System.out.println(res);
        if(res == num) {
            System.out.println(true);
            // return true;
        } else { 
            System.out.println(false);
            // return false;
        }
    }
}
