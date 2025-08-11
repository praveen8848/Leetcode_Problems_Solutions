package Leetcode_Easy;

public class Leetcode1351 {
    public static void main(String[] args) {
        int[][] grid = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        int ans = countNegatives(grid);
        System.out.println(ans);
    }

    private static int countNegatives(int[][] grid) {
//        int count = 0;
//        int m = grid.length;
//        int j = grid[0].length-1;
//        for(int i = 0; i<m; i++) {
//                while(j>=0 && grid[i][j]<0 ){
//                    if(grid[i][j]<0){
//                        count++;
//                    }
//                    j--;
//                }
//                j =  grid[0].length-1;
//        }
//        return count;
        int count = 0;
        int rStart = 0;
        int cStart = grid[0].length-1;
        while(rStart<grid.length && cStart>=0){
            if(grid[rStart][cStart]<0){
                count+=(grid.length-rStart);
                cStart--;
            }
            else{
                rStart++;
            }
        }
        return count;
    }
}
