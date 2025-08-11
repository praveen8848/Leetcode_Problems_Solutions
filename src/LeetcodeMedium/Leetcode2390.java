package LeetcodeMedium;

import java.util.Stack;

public class Leetcode2390 {
    public static void main(String[] args) {
        String s = "leet**cod*e";
        String ans = removeStars(s);
        System.out.println(ans);
    }

    private static String removeStars(String s) {
        Stack<Character> st  = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if(st.isEmpty() && sb.isEmpty()){
                st.push(s.charAt(i));
                sb.append(s.charAt(i));
            }
            else{
                if(s.charAt(i) == '*'){
                    st.pop();
                    sb.deleteCharAt(sb.length()-1);
                }
                else{
                    st.push(s.charAt(i));
                    sb.append(s.charAt(i));
                }
            }
        }
        return sb.toString();
    }
}
