package Leetcode_Easy;

import java.util.Arrays;

public class Leetcode3643 {
    public static void main(String[] args) {
        int[][] grid = {{3,4}, {2,3}};
        int[][] ans = buidit(grid, 0, 0, 1);
        for(int i = 0; i<ans.length; i++){
            System.out.println(Arrays.toString(ans[i]));
        }
    }

    private static int[][] buidit(int[][] grid, int x, int y, int k) {
        for (int i = 0; i < k / 2; i++) {

            // Calculate our absolute top and bottom rows for this step
            int topRow = x + i;
            int bottomRow = x + k - 1 - i;

            // Sweep across the columns of the submatrix (length of k)
            for (int j = y; j < y + k; j++) {
                // Perform the swap
                int temp = grid[topRow][j];
                grid[topRow][j] = grid[bottomRow][j];
                grid[bottomRow][j] = temp;
            }
        }

        return grid;
    }

}
