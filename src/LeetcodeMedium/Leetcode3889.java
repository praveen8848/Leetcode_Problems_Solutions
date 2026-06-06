package LeetcodeMedium;

import java.util.HashMap;

public class Leetcode3889 {
    public static void main(String[] args) {
        String s = "ab1z9";
        int ans = findit(s);
        System.out.println(ans);
    }

    private static int findit(String s) {
        int sum = 0;

        int[] freq = new int[128];
        for(int i = 0; i<s.length(); i++){
            int c = s.charAt(i);
            freq[c]++;
        }

        for(int i = 0; i<13; i++){
            if(i<5){
                sum += Math.abs(freq[48+i]-freq[57-i]);
            }
            sum += Math.abs(freq[97+i]-freq[122-i]);
        }
        return sum;
    }
}
