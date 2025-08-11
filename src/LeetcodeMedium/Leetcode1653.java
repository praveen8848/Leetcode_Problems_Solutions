package LeetcodeMedium;

import java.util.Stack;

public class Leetcode1653 {
    public static void main(String[] args) {
        String s =   "aababbab";
        int ans = minimumDeletions(s);
        System.out.println(ans);
    }

    private static int minimumDeletions(String s) {
        Stack<Character> st = new Stack<>();

        int deletecount = 0;
        for (int i = 0; i < s.length(); i++) {
           if(! st.isEmpty() && st.peek() == 'b' && s.charAt(i) == 'a'){
               st.pop();
               deletecount++;
           }
           else {
               st.push(s.charAt(i));
           }
        }
        return deletecount;
    }
}
