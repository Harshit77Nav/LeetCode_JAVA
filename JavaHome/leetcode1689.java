// 1689. Partitioning Into Minimum Number Of Deci-Binary Numbers

public class leetcode1689 {
    public static void main(String[] args) {
        // n = "27346209830709182346"
        String n = "27346209830709182346";
        int max = 0;
        for(int i=0; i < n.length(); i++) {
            int temp = n.charAt(i) - '0';
            max = Math.max(max, temp);
        }
        System.out.println(max);
        // return max;
    }
}
