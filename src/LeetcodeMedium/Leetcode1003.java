package LeetcodeMedium;

import java.util.*;

public class Leetcode1003 {
    public static void main(String[] args) {
        String s =  "ac";
        boolean ans = checkit(s);
        System.out.println(ans);
    }

    private static boolean checkit(String s) {
        boolean ans = false;
        Stack<Character> st = new Stack<>();
        int i = 0;
        while (i < s.length()){
            char ch = s.charAt(i);
            if(st.isEmpty()){
                st.push(ch);
            }
            else if(ch == 'c' && st.peek() == 'b'){
                char a = st.pop();
                if(!st.isEmpty()) {
                    if (st.peek() != 'a') {
                        st.push(a);
                        st.push(ch);
                    } else {
                        st.pop();
                    }
                }
                else {
                    st.push(a);
                    st.push(ch);
                }
            }
            else {
                st.push(ch);
            }
            i++;
        }
        if(st.isEmpty()){
            ans = true;
        }
        return ans;
    }
}
