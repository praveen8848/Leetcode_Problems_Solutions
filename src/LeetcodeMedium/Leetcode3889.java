package LeetcodeMedium;

import java.util.HashMap;

public class Leetcode3889 {
    public static void main(String[] args) {
        String s = "4m7n";
        int ans = findit(s);
        System.out.println(ans);
    }

    private static int findit(String s) {
        int sum = 0;

        HashMap<Character, Integer> mp = new HashMap<>();

        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            mp.put(c, mp.getOrDefault(c, 0) + 1);
        }

        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            if(!mp.containsKey(c)) continue;
            if(c>='a' && c<='z'){
                int t = (int)(c-'a');
                char c2 = (char)(122-t);
                if(mp.containsKey(c2)){
                    sum += Math.abs(mp.get(c) - mp.get(c2));
                    mp.remove(c2);
                }
                else{
                    sum += mp.get(c);
                }

            }
            else{
                int t = (c-'0');
                char c2 = (char)(56-t+1);
                if(mp.containsKey(c2)){
                    sum += Math.abs(mp.get(c) - mp.get(c2));
                    mp.remove(c2);
                }
                else{
                    sum += mp.get(c);
                }

            }
            if(mp.containsKey(c)){
                mp.remove(c);
            }
        }
        return sum;
    }
}
