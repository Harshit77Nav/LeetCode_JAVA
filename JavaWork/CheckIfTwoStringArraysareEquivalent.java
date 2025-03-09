//1662. Check If Two String Arrays are Equivalent

public class CheckIfTwoStringArraysareEquivalent {
    public static void main(String[] args) {
        int word1[] = {1,2,5,4,0} , word2[] = {2,4,5,0,1};
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();
        int i=0;
        while (i < word1.length || i < word2.length) {
            if(i < word1.length) 
                str1.append(word1[i]);
            if(i < word2.length) 
                str2.append(word2[i]);
            i++;
        }
        if(str1.toString().equals(str2.toString()))
            System.out.println(true);
        else 
            System.out.println(false);
    }
}
