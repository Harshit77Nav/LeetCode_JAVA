// 151. Reverse Words in a String
// import java.util.*;

public class ReverseWordsinaString {
    public static void main(String[] args) {
        //"a good   example"
        String s = "  hello  world  ";
        StringBuilder str = new StringBuilder();
        String[] arr = s.trim().split("\\s+");

        for(int i=arr.length-1; i>=0; i--) {
            str.append(arr[i]).append(" ");
        }
        System.out.println(str.toString().trim());












        // FIRST APPROACH........................................
        // String str = "";
        // String temp = "";
        // boolean seen = false;
        // for(int i=s.length()-1; i>=0; i--) {
        //     if(s.charAt(i) == ' ' && seen)continue;
        //     if(s.charAt(i) == ' ' && seen == false) {
        //         if(str == "" && temp != ""){
        //             str = str +""+ temp;
        //             System.out.println(i);
        //         }
        //         else if(temp != ""){
        //             str = str +" "+ temp;
        //         }
        //         temp = "";
        //         seen = true;
        //     } else {
        //         if(s.charAt(i) == ' ') continue;
        //         temp = s.charAt(i) + temp;
        //         seen = false;
        //     }
        //     if(i == 0 && seen == false) {
        //         if(str == "")
        //             str = str +""+ temp;
        //         else
        //             str = str +" "+ temp;
        //     }
        // }
        // System.out.println(str);
    }
}
