package LeetcodeMedium;

import java.util.Stack;

public class Leetcde678 {
    public static void main(String[] args) {
        String s =    "(((()*())))((()(((()(()))()**(*)())))())()()*";
        boolean ans = checkit(s);
        System.out.println(ans);
    }

    private static boolean checkit(String s) {
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(st1.isEmpty()){
                if(ch == ')' && st2.isEmpty()){
                    return false;
                }
                else if(ch == ')' && !st2.isEmpty()){
                    st2.pop();
                }
                else {
                    st1.push(i);
                }
            }
            else if(ch == '*'){
                st2.push(i);
            }
            else if(ch == ')'&& s.charAt(st1.peek()) == '('){
                st1.pop();
            }
            else  {
                st1.push(i);
            }
        }

        while(!st1.isEmpty() && !st2.isEmpty()){
            if(s.charAt(st1.peek()) == ')') {
                if (st1.peek() < st2.peek()) {
                    st1.pop();
                    st2.pop();
                }
                else {
                    return  false;
                }
            }
            else {
                if (st1.peek() > st2.peek()) {
                    st1.pop();
                    st2.pop();
                }
                else {
                    return  false;
                }
            }

        }
        if(!st1.isEmpty()){
            return false;
        }
        return true;
    }
}
