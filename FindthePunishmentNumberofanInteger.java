// 2698. Find the Punishment Number of an Integer

public class FindthePunishmentNumberofanInteger {
    public static void main(String[] args) {
        //n = 37
        int n = 37;
        int sum = 0;
        for(int i=1; i<=n; i++) {
            int square = i * i;
            if(isValid(0, String.valueOf(square), i, 0)){
                sum += square;
            }
        }
        System.out.println(sum);
    }

    static boolean isValid(int index, String x, int target, int currentSum ) {
        if(index == x.length()) {
            return currentSum == target;
        }

        int num = 0;
        for(int j=index; j<x.length(); j++) {
            num = num * 10 + (x.charAt(j) - '0');
            if(isValid(j + 1, x, target, currentSum + num)) {
                return true;
            }
        }

        return false;
    }

}
