package LeetcodeMedium;

import java.util.Stack;

public class leetcode921 {
    public static void main(String[] args) {
        String s = "(((()(())())))";
        int ans = minaddtomakevalid(s);
        System.out.println(ans);
    }

    private static int minaddtomakevalid(String s) {
        Stack<Character> st = new Stack<>();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if(st.isEmpty()){
                st.push(s.charAt(i));
            }
            else if(s.charAt(i) == ')' && st.peek() == '('){
                st.pop();
            }
            else {
                st.push(s.charAt(i));
            }
        }
        return st.size();
    }
}
