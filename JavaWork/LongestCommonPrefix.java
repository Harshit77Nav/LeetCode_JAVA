// 14. Longest Common Prefix

public class LongestCommonPrefix {
    public static void main(String[] args) {
        // strs = ["flower","flow","flight"]
        String strs[] = {"flower","flow","flight"};
        String prefix = strs[0];
        for(int i=1; i<strs.length; i++){
            String temp = "";
            for(int j=0; j<strs[i].length(); j++){
                if(prefix.length()-1 >= j && prefix.charAt(j) == strs[i].charAt(j)){
                    temp = temp+strs[i].charAt(j);
                } else {
                    break;
                }
            }
            prefix = temp;
        }
        System.out.println(prefix);
        System.out.println(Integer.MAX_VALUE/10);
    }
}
