package LeetcodeMedium;

import java.util.Stack;

public class Leetcode1717 {
    public static void main(String[] args) {
        String s = "cbaabwbbbabbwaaq";
        int x = 4074;
        int y = 9819   ;
        int ans = Maximumsum(s,x,y);
        System.out.println(ans);
    }

    private static int Maximumsum(String s, int x, int y) {
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (x > y) {
                if (st.isEmpty()) {
                    st.push(s.charAt(i));
                } else {
                    if (s.charAt(i) == 'b') {
                        if (st.peek() == 'a') {
                            sum = sum + x;
                            st.pop();
                        } else {
                            st.push(s.charAt(i));
                        }
                    } else {
                        st.push(s.charAt(i));
                    }
                }
            } else {
                if (st.isEmpty()) {
                    st.push(s.charAt(i));
                } else {
                    if (s.charAt(i) == 'a') {
                        if (st.peek() == 'b') {
                            sum = sum + y;
                            st.pop();
                        } else {
                            st.push(s.charAt(i));
                        }
                    } else {
                        st.push(s.charAt(i));
                    }
                }
            }
        }
        int m = st.size();
        if(x>y){
            for (int j = 0; j < m; j++) {
                if (st.peek() == 'a') {
                    sb.append(st.pop());
                }
                else if (!sb.isEmpty() && st.peek() == 'b') {
                    sum = sum + y;
                    sb.deleteCharAt(sb.length() - 1);
                    st.pop();
                }
                else if(!sb.isEmpty() && st.peek() != 'b') {
                    sb.delete(0,sb.length());
                    st.pop();
                }
                else{
                    st.pop();
                }
            }
        }
        else {
            for (int j = 0; j < m; j++) {
                if (st.peek() == 'b') {
                    sb.append(st.pop());
                }
                else if (!sb.isEmpty() && st.peek() == 'a') {
                    sum = sum + x;
                    sb.deleteCharAt(sb.length() - 1);
                    st.pop();
                }
                else if(!sb.isEmpty() && st.peek() != 'a') {
                    sb.delete(0,sb.length());
                    st.pop();
                }
                else{
                    st.pop();
                }
            }
        }

        return sum;
    }
}
