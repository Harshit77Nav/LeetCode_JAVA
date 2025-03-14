// 709. To Lower Case

public class ToLowerCase {
    public static void main(String[] args) {
        //s = "Hello"
        String s = "LOVELY";
        String  res = "";
        for(int i=0; i<s.length(); i++) {
            int val = s.codePointAt(i);
            if(val < 97) {
                int str = val +32;
                res += (char)str;
            } else {
                res += s.charAt(i);
            }
        }
        System.out.println(res);

        // s.toLowerCase(); 
    }
}
