import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        // s = ["h","e","l","l","o"]
        char s[] = {'H','a','n','n','a','h'};

        for(int i=0; i<=s.length/2; i++){
            char temp = s[s.length-i-1];
            s[s.length-i-1] = s[i];
            s[i] = temp;

        }
        System.out.println(Arrays.toString(s));
    }
}
