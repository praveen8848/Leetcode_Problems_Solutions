package Leetcode_Easy;

public class Leetcode1128 {
    public static void main(String[] args) {
        int[][] dominoes = {{1,1},{2,2},{1,1},{1,2},{1,2},{1,1} };
        int ans = findit(dominoes);
        System.out.println(ans);
    }

    private static int findit(int[][] dominoes) {
        int ans = 0;
        for(int i = 0; i<dominoes.length; i++){
            int x = dominoes[i][0];
            int y = dominoes[i][1];
            for(int j = i+1; j<dominoes.length; j++){
                int p = dominoes[j][0];
                int q = dominoes[j][1];
                if(x == p && y == q){
                    ans++;
                }
                else if(x == q && y == p){
                    ans++;
                }
            }
        }
        return ans;
    }
}
