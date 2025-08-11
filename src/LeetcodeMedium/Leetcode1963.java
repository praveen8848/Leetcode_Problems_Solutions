package LeetcodeMedium;

import java.util.Stack;

public class Leetcode1963 {
    public static void main(String[] args) {
        String s =   "]]]][[][[][[[]]][[]][[[[][]]][[]]]]]][]][[][][[]][][[]]]][[[[[[[";
        int ans = minswap(s);
        System.out.println(ans);
    }

    private static int minswap(String s) {
//        Stack<Character> st = new Stack<>();
//        int count = 0;
//        for (int i = 0; i < s.length(); i++) {
//          if(st.isEmpty()){
//              st.push(s.charAt(i));
//          }
//          else if(s.charAt(i) == ']' && st.peek() == '['){
//              st.pop();
//          }
//          else {
//              st.push(s.charAt(i));
//          }
//        }
//        StringBuilder sb = new StringBuilder();
//       int x = st.size()/2;
//       if(x%2 == 1){
//          count = x/2 + 1;
//       }
//       else {
//           count = x/2;
//       }
//
//        return count;
        //Above approach is correct but here is different solution
        int balance = 0;
        int swaps = 0;

        // Iterate through the string
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '[') {
                balance++;  // Increase balance for an opening bracket
            } else {
                balance--;  // Decrease balance for a closing bracket
            }

            // If balance goes negative, it means we have more closing brackets
            // Swap is needed to fix this
            if (balance < 0) {
                swaps++;
                balance = 1; // Reset balance as we consider the swap done
            }
        }

        return swaps;
    }
}
