package Leetcode_HARD;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;

public class Leetcode862 {
    public static void main(String[] args) {
        int[] nums = {2,-1,2};
        int k = 3;
        int ans = f(nums,k);
        System.out.println(ans);
    }

    private static int f(int[] nums, int k ) {
         long sum = 0;
        int ans = Integer.MAX_VALUE;
        Deque<Integer> dq = new ArrayDeque<>();
        long[] prefixsum = new long[ nums.length + 1];

        for(int i = 1; i<=nums.length; i++){
            prefixsum[i]  = prefixsum[i-1] + nums[i-1];
        }

        for (int i = 0; i < prefixsum.length; i++) {
//            if( prefixsum[i] >= k){
//                ans = Math.min(ans, i+1);
//            }

            while(! dq.isEmpty() &&  prefixsum[i]-prefixsum[dq.peekFirst()]>=k){
                ans = Math.min(ans, i- dq.pollFirst());
            }

             while(!dq.isEmpty() && prefixsum[i]<=prefixsum[dq.peekLast()]){
                 dq.pollLast();
            }
             dq.addLast(i);
        }


        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}
