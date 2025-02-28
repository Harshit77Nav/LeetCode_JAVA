//2391. Minimum Amount of Time to Collect Garbage

public class MinimumAmountofTimetoCollectGarbage {
    public static void main(String[] args) {
        //garbage = ["MMM","PGM","GP"], travel = [3,10]
        String garbage[] =  {"G","MMMMMMMMMM"};
        int travel[] = {2,4,3};

        int m = 0, p = 0, g = 0;
        int lastM = -1, lastP = -1, lastG = -1;

        for(int i=0; i<garbage.length; i++) {
            String s = garbage[i];
            for(int j=0; j<s.length(); j++) {
                if(s.charAt(j) == 'M'){
                    m += 1;
                    lastM = i-1;
                } else if(s.charAt(j) == 'P') {
                    p += 1;
                    lastP = i-1;
                } else {
                    g += 1;
                    lastG = i-1;
                }
            }
        }
        int temp = 0;
        for(int i=0; i<travel.length; i++) {
            temp += travel[i];
            if(i == lastM) {
                m += temp;
            }
            if(i == lastG) {
                g += temp;
            }
            if(i == lastP) {
                p += temp;
            }
        }
        int res = m + g + p;
        System.out.println(res);
    }
}
