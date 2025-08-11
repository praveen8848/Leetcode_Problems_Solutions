package Leetcode_Easy;

import java.util.Arrays;

public class Leetcode2574 {
    public static void main(String[] args) {
        int[] nums = {10,4,8,3};
        int[] ans = findit(nums);
        System.out.println(Arrays.toString(ans));
    }
    static int[] findit(int[] nums){
        int[] ans = new int[nums.length];
        int[] ans2 = new int[nums.length];
        int[] ans3 = new int[nums.length];
        int sum = 0;

        int left = 0;
        int right = 0;
        for(int i = 0; i<nums.length; i++){
            sum = sum + nums[i];
            ans[i] = sum-nums[i];
        }
        sum = 0;
        for(int i = nums.length-1;i>=0; i--){
            sum = sum + nums[i];
            ans2[i] = sum - nums[i];
        }

        for(int i = 0; i<nums.length; i++){
            left = ans[i];
            right = ans2[i];
            ans3[i] = Math.abs(right - left);
        }

        return ans3;
    }
}
