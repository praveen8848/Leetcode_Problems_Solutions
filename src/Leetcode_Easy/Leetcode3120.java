package Leetcode_Easy;

import java.util.*;
import java.util.Map;

public class Leetcode3120 {
    public static void main(String[] args) {
        String word = "aaAbcBC";
        int ans = findit(word);
        System.out.println(ans);
    }

    private static int findit(String word) {
        Map<Character, Integer> st = new HashMap<>();
        int count = 0;
        for(int i = 0; i<word.length(); i++){
            st.put(word.charAt(i),st.getOrDefault(word.charAt(i),0)+1);
        }

        for(int i = 0; i<word.length(); i++){
            char ch = word.charAt(i);
            if(ch  <= 96){
                char ch2 = (char) (ch + 32);
                if(st.containsKey(ch2) && st.get(ch2)>0){
                    st.put(ch2,st.get(ch2)-1);
                    count++;
                }
            }
        }
        return count;
    }
}
