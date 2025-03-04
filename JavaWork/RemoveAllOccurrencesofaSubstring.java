// 1910. Remove All Occurrences of a Substring
// import java.util.*;

public class RemoveAllOccurrencesofaSubstring {
    public static void main(String[] args) {
        //s = "daabcbaabcbc", part = "abc"
        String s = "daabcbaabcbc", part = "abc";
        StringBuilder str = new StringBuilder(s);

        while(true) {
            if(str.indexOf(part) != -1){
                int idx = str.indexOf(part);
                str = str.delete(idx, idx+part.length());
            } else {
                break;
            }
        }
        System.out.println(str.toString());
    }
}
