public class FirstOccurrenceinaString {
    public static void main(String[] args) {
        int k = 0;
        String haystack = "mississippi", needle = "issipi";
        for(int i=0; i<haystack.length(); i++){
            if(haystack.charAt(i) == needle.charAt(k) && i+needle.length() <= haystack.length()){
                String str = haystack.substring(i, i+needle.length());
                System.out.println(str);
                if(str.equals(needle)){
                    System.out.println(i);
                }
            }
        }
        // return -1;
        System.out.println(-1);
    }
}
