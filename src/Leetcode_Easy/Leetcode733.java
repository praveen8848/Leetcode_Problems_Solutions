package Leetcode_Easy;

public class Leetcode733 {
    static int[][] ans;
    public static void main(String[] args) {
        int[][] image = {{1,1,1},{1,1,0},{1,0,1}};
        int sr = 1;
        int sc = 1;
        int color = 2;
        int t = image[sr][sc];
        ans = new int[image.length][image[0].length];
        for(int i = 0; i<image.length; i++){
            for(int j = 0; j<image[0].length; j++){
                ans[i][j] = image[i][j];
            }
        }
        dfs(image, sr, sc, color, t);
        for(int i = 0; i<image.length; i++){
            for(int j = 0; j<image[0].length; j++){
                System.out.print(ans[i][j]  + " ");
            }
            System.out.println();
        }
    }
    public static void dfs(int[][] image, int sr, int sc, int color, int t){
        if(sr < 0 || sc < 0 ||  sc >= image[0].length|| sr>= image.length || ans[sr][sc] != t ){
            return;
        }
        ans[sr][sc] = color;
        dfs(image, sr+1, sc, color, t);
        dfs(image, sr-1, sc, color, t);
        dfs(image, sr, sc+1, color, t);
        dfs(image, sr, sc-1, color, t);
    }
}
