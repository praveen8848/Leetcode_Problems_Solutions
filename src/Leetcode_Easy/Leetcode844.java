package Leetcode_Easy;

import java.util.Stack;

public class Leetcode844 {
    public static void main(String[] args) {
        String s =  "y#fo##f";
        String t =  "y#f#o##f";
        boolean ans = backspaceCompare(s,t);
        System.out.println(ans);
    }

    private static boolean backspaceCompare(String s, String t) {
        Stack<Character> st  = new Stack<>();
        Stack<Character> st2  = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if(st.isEmpty()){
                if(s.charAt(i) != '#'){
                    st.push(s.charAt(i));
                }
            }
            else{
                if(s.charAt(i) == '#'){
                    st.pop();
                }
                else {
                    st.push(s.charAt(i));
                }
            }
        }
        for (int i = 0; i < t.length(); i++) {
            if(st2.isEmpty()){
                if (t.charAt(i) != '#') {
                    st2.push(t.charAt(i));
                }
            }
            else{
                if(t.charAt(i) == '#'){
                    st2.pop();
                }
                else {
                    st2.push(t.charAt(i));
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        while (!st.isEmpty()){
            sb.append(st.pop());
        }
        while (!st2.isEmpty()){
            sb2.append(st2.pop());
        }
        return sb.compareTo(sb2) == 0;
    }
}
