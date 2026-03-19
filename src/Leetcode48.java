import java.util.Arrays;

public class Leetcode48 {
    public static void main(String[] args) {
        int[][] matrix = {{5,1,9,11}, {2,4,8,10}, {13,3,6,7}, {15,14,12,16}};
        int[][] ans = buildit(matrix);

        for(int i = 0;i<ans.length; i++){
            System.out.println(Arrays.toString(ans[i]));
        }
    }

    private static int[][] buildit(int[][] matrix) {
        int n = matrix.length;
        int k= n;
        for(int i = 0; i<n; i++){
            for(int j = 0;j<k; j++){
                int t = matrix[n-1-j][n-1-i];
                matrix[n-1-j][n-1-i] = matrix[i][j];
                matrix[i][j] = t;
            }
            k--;
        }
        for(int i = 0;i<matrix.length; i++){
            System.out.println(Arrays.toString(matrix[i]));
        }
        System.out.println();
        for(int i = 0; i<n; i++){
            for(int j = 0;j<n/2; j++){
                int t = matrix[j][i];
                matrix[j][i] = matrix[n-1-j][i];
                matrix[n-1-j][i] = t;
            }
        }
        return matrix;
    }
}
