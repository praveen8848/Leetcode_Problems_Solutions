package Leetcode_HARD;

import java.util.LinkedList;
import java.util.Queue;

public class Leetcode1970 {
    private static int[][] dir = {{1,0},{0,1},{-1,0},{0,-1}};
    private static int r, c = 0;
    public static void main(String[] args) {
        int[][] cells = {{1,1},{2,1},{1,2},{2,2}};
        int row = 2;
        int col = 2;
        int ans = latestDayToCross(row, col, cells);
        System.out.println(ans);
    }
    public static int latestDayToCross(int row, int col, int[][] cells) {
        r = row;
        c = col;
        int left = 1;
        int right = cells.length;
        int ans = 0;

        while(left<=right){
            int m = left + (right - left)/2;
            if(possible(m, cells)){
                ans = m;
                left = m+1;
            }
            else{
                right = m-1;
            }
        }
        return ans;
    }
    private static boolean possible(int d, int[][] cells){
        int[][] grid = new int[r][c];

        for(int i = 0; i<d; i++){
            grid[cells[i][0]-1][cells[i][1]-1] = 1;
        }

        Queue<int[]> q = new LinkedList<>();
        boolean[][] visited = new boolean[r][c];

        for(int i = 0;i<c;i++){
            if(grid[0][i] == 0){
                q.offer(new int[]{0,i});
                visited[0][i] = true;
            }
        }

        while(!q.isEmpty()){
            int[] cur = q.poll();

            int row = cur[0], col = cur[1];

            if( row == r-1) return true;

            for(int[] di: dir){
                int nr = row + di[0];
                int nc = col + di[1];

                if(nr>= 0 && nr<r && nc>=0 && nc<c && grid[nr][nc] == 0 && !visited[nr][nc]){
                    visited[nr][nc] = true;
                    q.offer(new int[] {nr, nc});
                }
            }
        }
        return false;
    }
}
