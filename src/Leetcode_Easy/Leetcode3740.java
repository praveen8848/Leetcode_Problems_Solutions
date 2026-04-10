package Leetcode_Easy;

import java.util.HashMap;

public class Leetcode3740 {
    public static void main(String[] args) {
        int[] nums = {1,1,2,3,2,1,2};
        int ans = findit(nums);
        System.out.println(ans);
    }

    private static int findit(int[] nums) {
        int n = nums.length;
        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                if (nums[i] != nums[j]) {
                    continue;
                }
                for (int k = j + 1; k < n; k++) {
                    if (nums[j] == nums[k]) {
                        int t = Math.abs(i-k) + Math.abs(j-i) + Math.abs(j-k);
                        ans = Math.min(ans, t);
                        break;
                    }
                }
            }
        }

        return ans == Integer.MAX_VALUE ? -1 : ans ;
    }
}
