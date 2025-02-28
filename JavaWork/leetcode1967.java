public class leetcode1967 {
    public static void main(String[] args) {
        // String patterns[] = {"a","b","c"};
        // String word = "aaaaabbbbb";
        // int result = 0;
        // for(int i=0; i<patterns.length; i++){
        //     if(word.contains(patterns[i])){
        //         result++;
        //     }
        // }
        // System.out.println(result);

        int prices[] = {7,6,4,3,1};
        int profit = 0;
        int buyingPrice = prices[0];
        for(int i=1; i<prices.length; i++){
          if(buyingPrice > prices[i]){
            buyingPrice = prices[i];
          } else {
            int temp = prices[i] - buyingPrice;
            profit = Math.max(temp, profit);
          }
        }
        System.out.println(profit);
    }
}
