package LeetcodeMedium;

import java.util.Arrays;

public class Leetcode1727 {
    public static void main(String[] args) {
        int[][] matrix = {{1,1,0}, {1,0,1}};
        int ans = findit(matrix);
        System.out.println(ans);
    }

    private static int findit(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int result = 0;
        int[] ans = new int[n];
        // Process each column row by row.
        for(int i = 0; i<m; i++){
            int sum = 0;
            for(int j = 0; j<n; j++){
                if(matrix[i][j] == 0){
                    ans[j] = 0;
                }
                else{
                    ans[j] += 1;
                }
            }
            // A row finished,  clone it to preserve the original ordering of streaks of 1
            int[] clone = ans.clone();

            // sort it to find the answer
            Arrays.sort(clone);
            for(int j = n-1; j>=0; j--){
                result = Math.max(result, clone[j]*(n- j));
            }
        }

        return result;
    }
}
