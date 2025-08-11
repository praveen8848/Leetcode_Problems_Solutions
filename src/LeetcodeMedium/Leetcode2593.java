package LeetcodeMedium;

import java.util.Stack;

public class Leetcode2593 {
    public static void main(String[] args) {
        int[] nums = {10,44,10,8,48,30,17,38,41,27,16,33,45,45,34,30,22,3,42,42};
        long ans = findit(nums);
        System.out.println(ans);
    }
    static long findit(int[] nums){
        Stack<Integer> st = new Stack<>();
        long sum = 0;
        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            if (st.isEmpty()) {
                st.push(temp);
            }
            else if (temp < st.peek()) {
                st.pop();
                st.push(temp);
            }
            else if(temp>st.peek()){
                sum = sum+ st.pop();
            }
            else{
                sum = sum + temp;
                st.pop();
            }
        }
        while(!st.isEmpty()){
            sum = sum + st.pop();
        }
        return sum;
    }
}
