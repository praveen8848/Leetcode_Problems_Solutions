package LeetcodeMedium;

public class Leetcode74 {
    public static void main(String[] args) {
        int[][] matrix = {{1,3}};
        int target = 2;
        boolean  ans  = searchMatrix(matrix,target);
        System.out.println(ans);
    }
    static boolean searchMatrix(int[][] matrix, int target){
//        if(matrix[0].length == 0){
//            return false;
//        }
//        int i = 0;
//        int j = matrix[i].length-1;
//        while(i< matrix.length && j>=0){
//            if(target<matrix[i][j]){
//                while (i<=j) {
//                    int mid = i + (j - i) / 2;
//                    if (matrix[i][mid] > target) {
//                        j = mid - 1;
//                    } else if (matrix[i][mid] < target) {
//                        j = mid + 1;
//                    } else {
//                        return true;
//                    }
//                }
//            } else if (target == matrix[i][j]) {
//                return true;
//            }
//            else {
//                i++;
//            }
//        }
//        return false;
        int m = matrix.length;
        int j = matrix[0].length-1;
        int i = 0;
        while(i<m && j>=0){
            if(target == matrix[i][j]){
                return true;
            } else if (matrix[i][j] < target) {
                j--;
            }
            else if (matrix[i][j] > target) {
                i++;
            }
        }
        return false;
    }
}
