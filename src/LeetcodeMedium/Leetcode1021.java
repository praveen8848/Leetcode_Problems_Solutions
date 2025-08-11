package LeetcodeMedium;

import java.util.Stack;

public class Leetcode1021 {
    public static void main(String[] args) {
        String s = "(()())(())(()(()))";
        String ans = removeLast(s);
        System.out.println(ans);
    }

    private static String removeLast(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < s.length(); i++) {
            Character ch = s.charAt(i);
            if(st.isEmpty()){
                st.push(ch);
                sb.append(ch);
            }
            else if(ch == ')' && st.peek() == '('){
                sb.append(ch);
                st.pop();
            }
            else {
                st.push(ch);
            }
        }
        while(!st.isEmpty()){
            if(st.pop() == ')'){
                sb.append('(');
            }
            else {
                sb.append(')');
            }

        }
        return sb.toString();
    }
}
