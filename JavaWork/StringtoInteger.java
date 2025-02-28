// 8. String to Integer (atoi)

public class StringtoInteger {
    public static void main(String[] args) {
        // " -042"
        String s = "+-12";
        String str = s.trim();
        String res = "";
        boolean flag = false;
        boolean  deci = false;
        boolean posi = false;
        for(int i=0; i < str.length(); i++) {
            int temp =  Character.getNumericValue(str.charAt(i));
            if(temp >=0 && temp <= 9) {
                res += str.charAt(i);
            } else if(str.charAt(i) == '-' && res.length() == 0) {
                flag = true;
            } else if(str.charAt(i) == '+' && res.length() == 0) {
                posi = true;
                continue;
            } else if(str.charAt(i) == '-' && res.length() != 0) {
                break;
            } else if(str.charAt(i) == '+' && res.length() != 0){
                break;
            } else if(str.charAt(i) == '.') {
                deci = true;
                res += str.charAt(i);
            } else if(str.charAt(i) == '-' && posi ) {
                break;
            } else {
                break;
            }
        }
        double temp2 = (res.isEmpty()) ? 0.0 : Double.parseDouble(res);
        if(flag){
            temp2 = -temp2;
        }
        if(temp2 > Integer.MAX_VALUE / 10 ) {
            System.out.println(Integer.MAX_VALUE);
        } else if( temp2 < Integer.MIN_VALUE/10 ) {
            System.out.println(Integer.MIN_VALUE);
        }
        int result = 0;
        if(res.length() == 0 ) {
            System.out.println(0);
        }else if(deci) {
        double temp = Double.parseDouble(res);
        System.out.println((int)temp);
        return;
        } else {
            result = Integer.parseInt(res);
        }
        if(flag) {
            System.out.println(-result);
        } else {
            System.out.println(result);
        }
    }
}
