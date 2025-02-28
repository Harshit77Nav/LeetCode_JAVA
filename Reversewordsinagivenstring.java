//Reverse words in a given string

public class Reversewordsinagivenstring {
    public static void main(String[] args) {
        //s = “bosscoder quiz practice code”
        String s = "apple";

		String str = "";
        String temp = "";
        for(int i=s.length()-1; i>=0; i--) {
            if(s.charAt(i) == ' ') {
                if(str == "")
                    str = str +""+ temp;
                else
                    str = str +" "+ temp;
                temp = "";
            } else {
                temp = s.charAt(i) + temp;
            }
            if(i == 0) {
                if(str == "")
                    str = str +""+ temp;
                else
                    str = str +" "+ temp;
            }
        }
        System.out.println(str);
        System.out.println(s);
    }
}
