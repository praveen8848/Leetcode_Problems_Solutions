package LeetcodeMedium;

public class Leetcode2414 {
    public static void main(String[] args) {
        String s = "abcde";
        int ans  = longestSubstring(s);
        System.out.println(ans);
    }

    private static int longestSubstring(String s) {
        int count = 0;
        int max = Integer.MIN_VALUE;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(sb.isEmpty()){
                sb.append(ch);
                count++;
            }
            else if((int)ch == (int)sb.charAt(sb.length()-1) + 1) {
                sb.append(ch);
                count++;
            }
            else{
                if(count>max){
                    max = count;
                }
                count = 0;
                sb.delete(0,sb.length());
                sb.append(ch);
                count++;
            }
        }
        if(count>max){
            max = count;
        }
        return max ;
    }
}
