package LeetcodeMedium;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Leetcode1249 {
    public static void main(String[] args) {
        String s =   "(a(b(c)d)e)f)g(h)i)";// "lee(t(c)o)de)"; // ))(( , "a)b(c)d"
        String ans = removeit(s);
        System.out.println(ans);
    }

    private static String removeit(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        List<Integer> lst = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '('){
                st.push(s.charAt(i));
                lst.add(i);
            }
            else if (s.charAt(i) == ')') {
                if (!st.isEmpty()){
                    if(st.peek() == '('){
                        st.pop();
                        lst.removeLast();
                    }
                }
                else {
                    lst.add(i);
                }
            }
        }
        int k = 0;
        for (int i = 0; i < s.length(); i++) {
            if(!lst.isEmpty()){
                if(lst.get(k) != i){
                    sb.append(s.charAt(i));
                }
                else if(k<lst.size()-1){
                    k++;
                }
            }
            else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
