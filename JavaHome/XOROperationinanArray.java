// 1486. XOR Operation in an Array

public class XOROperationinanArray {
    public static void main(String[] args) {
        // n = 5, start = 0
        int n = 5, start = 0;
        int temp = 0;
        for(int i=0; i<n; i++) {
            int te = start + (2*i);
            temp = temp ^ te; 
        }
        System.out.println(temp);
    }
}
