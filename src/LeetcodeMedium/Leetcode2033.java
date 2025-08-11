package LeetcodeMedium;

import java.util.Arrays;

public class Leetcode2033 {
    public static void main(String[] args) {
        int[][] grid = {{1, 2}, {3, 4}};
        int x = 2;
        int ans = findit(grid, x);
        System.out.println(ans);
    }

    private static int findit(int[][] grid, int x) {
        int m = grid.length;
        int n = grid[0].length;
        int[] nums = new int[m * n];
        int k = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                nums[k] = grid[i][j];
                k++;
            }
        }

        int count = 0;
        int ans = Integer.MAX_VALUE;

        Arrays.sort(nums);
        k = nums[nums.length / 2];
        int r = k % x;
        count = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] % x != r) {
                return -1;
            }
            int t = Math.abs(k - nums[j]);
            count = count + t / x;

        }
        return count;
    }
}
