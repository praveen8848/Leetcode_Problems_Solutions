package LeetcodeMedium;

public class Leetcode378 {
    public static void main(String[] args) {
      int[][]  matrix = {{1,2},{3,4},{6,7},{8,9}};
      int k = 5;
      int ans = kthsmallest(matrix, k);
        System.out.println(ans);
    }

    private static int kthsmallest(int[][] matrix, int k) {
        int m = matrix.length;
        int n = matrix[0].length;
        int row = 0;
        int col = 0;
        int total = m*n;
        int x = 0;
         int[] nums = new int[total];
        for (int i = 0; i <m; i++) {
            for (int j = 0; j < n; j++) {
                nums[x] = matrix[i][j];
                x++;
            }
        }
        return nums[k-1];
    }
}
