//2220. Minimum Bit Flips to Convert Number

public class MinimumBitFlipstoConvertNumber {
    public static void main(String[] args) {
        //start = 10, goal = 7
        int start = 3, goal = 4;
        // String binS = Integer.toBinaryString(start);
        // String binG = Integer.toBinaryString(goal);
        // System.out.println(binS+" "+ binG);
        int count = 0;
        while (start != 0 || goal != 0) {
            int binS = (start&1), binG = (goal&1);
            if(binG == binS) {
                start >>= 1;
                goal >>= 1;
                continue;
            } else {
                start >>= 1;
                goal >>= 1;
                count++;
            }

        }
        System.out.println(count);
        // unique approach 
        // int p = start ^ goal;
        // int temp = Integer.bitCount(p);
        // System.out.println(temp);
    }
}
