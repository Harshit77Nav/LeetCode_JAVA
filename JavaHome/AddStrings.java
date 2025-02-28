public class AddStrings {
    public static void main(String[] args) {
        // num1 = "11", num2 = "123"
        String num1 = "1", num2 = "9";
        int  i = num1.length()-1;
        int j = num2.length()-1;
        int carry = 0;
        String res = "";
        while (i >= 0  || j >= 0) {
            int sum = 0 + carry;
            carry = 0;
            if(i >= 0) {
                int temp = num1.charAt(i) - '0';
                sum = sum + temp;
                i--;
            }
            if(j >= 0) {
                int temp = num2.charAt(j) - '0';
                sum = sum + temp;
                j--;
            }

            if(sum > 9) {
                int add = sum % 10;
                carry = sum/10;
                res = add + res;
            } else {
                res = sum + res;
            }
        }
        if(carry != 0) {
            res = carry + res;
        }
        System.out.println(res);
    }    
}
