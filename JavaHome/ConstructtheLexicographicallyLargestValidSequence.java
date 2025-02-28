// 1718. Construct the Lexicographically Largest Valid Sequence
import java.util.*;

public class ConstructtheLexicographicallyLargestValidSequence {
    public static void main(String[] args) {
        // n=3;
        int n = 7;
        boolean used[] = new boolean[n+1];
        int seq[] = new int[2*n-1];
        backtrack(0,used, seq, n);
        System.out.println(Arrays.toString(seq));
    }

    public static boolean backtrack(int index, boolean used[], int seq[], int n){
        while(index < seq.length && seq[index]!=0) index++;
        if(index == seq.length) return true;
        for(int i=n;i>=1;i--){
            if(used[i]) continue;
            if(i==1){
                seq[index] = i;
                used[i] = true;
                if(backtrack(index+1,used,seq,n)) return true;
                // if we cannot find answer
                seq[index]=0;
                used[i] = false;
            }else if(index + i < seq.length && seq[index+i] == 0){
                seq[index] = i;
                seq[index + i] = i;
                used[i] = true;
                if(backtrack(index+1,used,seq,n)) return true;
                // if we cannot find answer
                seq[index]=0;
                seq[index + i]=0;
                used[i] = false;
            }
        }
        return false;
    }
}
