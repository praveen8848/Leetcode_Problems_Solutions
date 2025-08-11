package Leetcode_Easy;

public class Leetcode2379 {
    public static void main(String[] args) {
        String blocks = "WBWBBBW";
        int k = 2;
        int ans = findit(blocks, k);
        System.out.println(ans);
    }

    private static int findit(String blocks, int k) {
        int j = 0;
        int count = 0;
        int ans = 1000;
        int in = 0;
        for(int i = 0; i<blocks.length(); i++){
            if(blocks.charAt(i) == 'W'){
                count++;
            }
            in++;
            if(in >= k){
                ans = Math.min(ans, count);
                if(blocks.charAt(j) == 'W'){
                    count--;
                }
                j++;
                in--;
            }
        }
        return ans;
    }
}
