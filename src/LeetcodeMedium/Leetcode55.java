package LeetcodeMedium;

public class Leetcode55 {
    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4};
        boolean ans = canJump(nums);
        System.out.println(ans);
    }
    static boolean canJump(int[] nums){
        int maxReach = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > maxReach) {
                // If current position is beyond the maximum reachable index, return false
                return false;
            }
            // Update the maximum reachable index
            maxReach = Math.max(maxReach, i + nums[i]);
            if (maxReach >= nums.length - 1) {
                // If the maximum reachable index is beyond or at the last index, return true
                return true;
            }
        }
        return false;
    }
}
