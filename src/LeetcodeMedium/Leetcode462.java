package LeetcodeMedium;

import java.util.Arrays;

class Leetcode462 {
    public static void main(String[] args) {
        int[] nums = {1,10,2,9};
        int ans = minMoves2(nums);
        System.out.println(ans);
    }
    public static int minMoves2(int[] nums) {
        long ans = 0;
        Arrays.sort(nums);
        int n = nums.length;
        int mid = nums[n/2];
        for(int i = 0; i<n; i++){
            ans += (long)Math.abs(mid-nums[i]);
        }

        return (int)ans;
    }
}