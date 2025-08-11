package Leetcode_Easy;
import java.util.*;
public class Leetcode682 {
    public static void main(String[] args) {
        String[] operations = {"5","-2","4","C","D","9","+","+"};
        int ans = sumit(operations);
        System.out.println(ans);
    }

    private static int sumit(String[] operations) {
        Stack<String> st = new Stack<>();
        int sum = 0;
        for(int i = 0; i < operations.length ; i++){
            if(st.isEmpty()){
                st.push(operations[i]);
            }
            else{
                String ch = operations[i];
                if(ch.equals("+")){
                    String x = st.pop();
                    String y = "";
                    if(!st.isEmpty()){
                        y =  st.pop();
                    }
                    int p = Integer.parseInt(x);
                    int q = Integer.parseInt(y);
                    int r = p + q;
                    String z = new String(String.valueOf(r));
                    st.push(y);
                    st.push(x);
                    st.push(z);
                }
                else if(ch.equals("D")){
                    String a = st.peek();
                    int d = Integer.parseInt(a);
                      d = d * 2;
                    String sb = String.valueOf(d);
                    st.push(sb);
                }
                else if(ch.equals("C")){
                    st.pop();
                }
                else {
                    st.push(operations[i]);
                }
            }
        }

        while(!st.isEmpty()){
             int m = Integer.parseInt(st.pop());
             sum = sum + m;
        }
        return sum;
    }
}
