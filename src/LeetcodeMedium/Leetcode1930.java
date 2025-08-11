package LeetcodeMedium;

import java.util.HashMap;
import java.util.HashSet;

public class Leetcode1930 {
    public static void main(String[] args) {
        String s = "bbcbaba";
        int ans = countP(s);
        System.out.println(ans);
    }

    private static int countP(String s) {
        HashMap<Character, Integer> mp = new HashMap<>();
        HashSet<String> st = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            mp.put(s.charAt(i), i);
        }
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int j = 0;
            if(mp.containsKey(c)){
                j = mp.get(c);
                int k = i+1;
                while(k<j){
                    char ch = s.charAt(k);
                    sb.append(c);
                    sb.append(ch);
                    sb.append(c);
                    if(! st.contains(sb.toString())){
                        st.add(sb.toString());
                        count++;
                    }
                    k++;
                    sb.delete(0,sb.length());
                }
            }
            mp.remove(c);
        }
        return count;
    }
}
