package LeetcodeMedium;

import java.util.Arrays;

public class Leetcode1861 {
    public static void main(String[] args) {
        char[][] box = {{'#','.','*','.'},
                {'#','#','*','.'}};

        for(char[] row : box){
            System.out.println(Arrays.toString(row));
        }
        System.out.println();
        char[][] ans = findit(box);
//        for (int i = 0; i < ans.length; i++) {
//            for (int j = 0; j < ans[i].length; j++) {
//                System.out.println(ans[i][j]);
//            }
//
//        }
        for(char[] row : ans){
            System.out.println(Arrays.toString(row));
        }
    }

    private static char[][] findit(char[][] box) {
        int m = box.length;
        int n = box[0].length;
        char[][] ans = new char[n][m];
        for(char[] ch : ans){
            Arrays.fill(ch,'.');
        }
        int count  = 0;
        int row = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(box[i][j] == '#'){
                    count++;
                }
                else if(box[i][j] == '*'){
                    ans[j][m-i-1]= '*';
                    fillit(ans,j-1,m-i-1,count);
                    count = 0;
                }
                else {
                    ans[j][m - i - 1] = '.';
                }
                row = j;
            }
            if(count != 0){
                fillit(ans,row,m-i-1,count);
            }
        }
        return ans;
    }

    private static void fillit(char[][] ans, int row, int column, int count) {
        while (count>0){
            ans[row][column] = '#';
            count--;
            row--;
        }
    }

}
