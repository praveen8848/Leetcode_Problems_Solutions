package Leetcode_Easy;

import java.util.HashMap;

public class Leetcode3365 {
    public static void main(String[] args) {
        String s = "abcd";
        String t = "abcd";
        int k = 1;
        boolean ans = findit(s,t,k);
        System.out.println(ans);
    }

    private static boolean findit(String s, String t, int k) {
        int n = s.length();
        int j = n/k;
        HashMap<String, Integer> mp = new HashMap<>();
        for (int i = 0; i < n; i = i +j) {
            String ss = s.substring(i,i+j);
            mp.put(ss,mp.getOrDefault(ss,0)+1);
        }
        for (int i = 0; i < n; i += j) {
            String ssd = t.substring(i, i + j);
            if(mp.containsKey(ssd) && mp.get(ssd)>0){
                mp.put(ssd, mp.get(ssd)-1);
            }
            else{
                return false;
            }
        }
        return true;
    }
}
