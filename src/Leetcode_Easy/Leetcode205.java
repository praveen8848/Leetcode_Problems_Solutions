package Leetcode_Easy;

import java.util.HashMap;
import java.util.Map;

public class Leetcode205 {
    public static void main(String[] args) {
        String s =  "badc";
        String t =  "baba";
        boolean ans = isIsomorphic(s,t);
        System.out.println(ans);
    }

    private static boolean isIsomorphic(String s, String t) {
        Map< Character, Character> mp = new HashMap<>();
        boolean ans = true;
        for (int i = 0; i < s.length(); i++) {
            if(mp.isEmpty()){
                mp.put(s.charAt(i) , t.charAt(i));
            }
            else if(mp.containsKey(s.charAt(i))){
                if(mp.get(s.charAt(i)) != t.charAt(i)){
                    return false;
                }
            }
            else {
                if(mp.containsValue(t.charAt(i))){
                    return false;
                }
                else {
                    mp.put(s.charAt(i), t.charAt(i));
                }
            }

        }
        return ans;
    }
}
