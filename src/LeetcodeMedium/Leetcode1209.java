package LeetcodeMedium;
import java.util.*;
public class Leetcode1209 {
    public static void main(String[] args) {
        String s = "ghanyhhhhhttttttthhyyyyyynnnnnnyqkkkkkkkrrrrrrjjjjjjjryyyyyyfffffffygq";
        int k = 7;
        String ans = findit(s, k);
        System.out.println(ans);
    }
    private static String findit(String s, int k){
        int[] count = new int[s.length()];
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            sb.append(c);
            int last = sb.length() - 1;

            if (last > 0 && sb.charAt(last) == sb.charAt(last - 1)) {
                count[last] = count[last - 1] + 1;
            } else {
                count[last] = 1;
            }

            if (count[last] >= k) {
                sb.delete(sb.length() - k, sb.length());
            }
        }

        return sb.toString();
    }
}
