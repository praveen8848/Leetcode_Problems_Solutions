package LeetcodeMedium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Leetcode187 {
    public static void main(String[] args) {
        String s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        System.out.println(findit(s));
    }

    private static List<String> findit(String s) {
        HashSet<String> st = new HashSet<>();
        HashSet<String> st2 = new HashSet<>();

        for(int i = 0;i<s.length()-9; i++){
            String ss = s.substring(i, i+10);
            if(!st.add(ss)){
                st2.add(ss);
            }
        }
        return new ArrayList<>(st2);
    }
}
