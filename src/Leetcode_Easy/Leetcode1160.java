package Leetcode_Easy;

import java.util.*;

public class Leetcode1160 {
    public static void main(String[] args) {
        String[]  words = {"cat","bt","hat","tree"};
        String chars = "atach";
        int ans = findit(words, chars);
        System.out.println(ans);
    }

    private static int findit(String[] words, String chars) {
        char[] ch = chars.toCharArray();
        int ans = 0;

        HashSet<Character> st = new HashSet<>();
        for(int i = 0; i<ch.length; i++){
            st.add(ch[i]);
        }

        for(int i = 0; i<words.length; i++){
            char[] ch2 = words[i].toCharArray();
            int j = 0;
            while(j<ch2.length){
                if(!st.contains(ch2[j])){
                    break;
                }
                j++;
            }
            if(j == ch2.length){
                ans = ans + ch2.length;
            }
        }
        return ans;
    }
}
