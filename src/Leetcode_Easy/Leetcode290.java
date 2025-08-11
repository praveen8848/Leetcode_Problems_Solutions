package Leetcode_Easy;

import java.util.HashMap;
import java.util.Map;

public class Leetcode290 {
    public static void main(String[] args) {
        String pattern = "abba";
        String  s = "dog dog dog dog";
        boolean ans = isPattern(pattern, s);
        System.out.println(ans);
    }

    private static boolean isPattern(String pattern, String s) {
        boolean ans = true;
        String[] str = s.split("\\s+");
        Map<Character,String> mp = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            if(mp.isEmpty()){
                mp.put(pattern.charAt(i), str[i]);
            }
            else if(mp.containsKey(pattern.charAt(i))){
                if(!str[i].equals(mp.get(pattern.charAt(i)))){
                    return false;
                }
            }
            else {
                if(mp.containsValue(str[i])){
                    return false;
                }
                mp.put(pattern.charAt(i), str[i]);
            }
        }
        return ans;
    }
}
