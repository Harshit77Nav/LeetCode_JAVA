package BCA.Maths;

public class PowerOfFour {
    public static void main(String[] args) {
        // n = 1
        int n = 1;
        if(n < 0) 
            System.out.println(false);
        if((n & (n-1))==0 && (n-1) % 3 == 0)
            System.out.println(true);
        else
            System.out.println(false);
    }
}
