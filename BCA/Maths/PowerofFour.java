// Power of Four
package BCA.Maths;

public class PowerofFour {
    public static void main(String[] args) {
        // n = 16
        int n = 16;
        if((n&3) == 0) System.out.println(true);
        else System.out.println(false);


        /*  ..........................................................to extract k bits from the last
         * int k = 4; // Number of bits to extract
         * int mask = (1 << k) - 1; // Creates a mask with k bits set to 1
         * int extracted = n & mask;
         * System.out.println("Extracted Bits: " + extracted);
         */
    }
}
