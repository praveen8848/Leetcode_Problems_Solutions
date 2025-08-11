package LeetcodeMedium;

import java.util.Stack;

public class Leetcode962 {
    public static void main(String[] args) {
        int[] nums = {6,0,8,2,1,5};
        int ans = findit(nums);
        System.out.println(ans);
    }

    private static int findit(int[] nums) {
        int maxwidth = 0;
        int maxx = 0;
        Stack<Integer> st = new Stack<>();

        for(int i = 0; i<nums.length; i++){
            if(st.isEmpty()|| nums[st.peek()]>nums[i]){
                st.push(i);
            }
        }

        for(int j= nums.length-1; j>=0; j--){
            while(!st.isEmpty() && nums[st.peek()]<=nums[j]) {
                maxx = Math.max(maxx, j-st.peek());
                st.pop();
            }
        }
        System.out.println(Math.ceilDiv(10,3));
        return maxx;
    }
}
