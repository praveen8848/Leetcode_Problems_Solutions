package LeetcodeMedium;

import java.util.Arrays;
import java.util.Stack;

public class Leetcode739 {
    public static void main(String[] args) {
        int[] temperatures = {73,74,75,71,69,72,76,73};
        int[] ans = finddays(temperatures);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] finddays(int[] temperatures) {
        Stack<Integer> st = new Stack<>();
        int n = temperatures.length;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && temperatures[i] > temperatures[st.peek()]) {

                ans[st.peek()] = i - st.peek();
                st.pop();

            }
            st.push(i);
        }
        return ans;
    }
}
