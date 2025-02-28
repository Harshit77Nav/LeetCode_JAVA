//38. Count and Say

public class CountAndSay {
    public static void main(String[] args) {
        // n = 4;
        int n = 4;
        String res = "";
        for(int i=0; i < n; i++) {
            int count = 0;
            Character store ='l';
            if(i == 0) {
                res += "1";
                continue;
            } else if (i == 1) {
                res = "11";
                continue;
            }
            String temp = "";
            for(int j=0; j < res.length(); j++) {
                if(j == 0) {
                    store = res.charAt(j);
                    count++;
                } else if(res.charAt(j) == store) {
                    count++;
                } else {
                    
                    temp += count + store;
                    store = res.charAt(j);
                    count = 1;
                }
            }
            res += temp;
        }
        System.out.println(res);
    }
}
