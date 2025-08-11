package LeetcodeMedium;

import java.util.HashMap;

public class Leetcode2516 {
    public static void main(String[] args) {
        String s  = "caccbbba";
        int k = 1;
        int ans = findit(s,k);
        System.out.println(ans);
    }
    static int findit(String s, int k){
        // Total counts
        int[] count = new int[3];
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }

        if (Math.min(Math.min(count[0], count[1]), count[2]) < k) {
            return -1;
        }

        // Sliding Window
        int res = Integer.MAX_VALUE;
        int l = 0;
        for (int r = 0; r < s.length(); r++) {
            count[s.charAt(r) - 'a']--;

            while (Math.min(Math.min(count[0], count[1]), count[2]) < k) {
                count[s.charAt(l) - 'a']++;
                l++;
            }
            res = Math.min(res, s.length() - (r - l + 1));
        }
        return res;
       
    }
}
