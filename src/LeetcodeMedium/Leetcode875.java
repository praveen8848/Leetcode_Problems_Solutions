package LeetcodeMedium;

public class Leetcode875 {
    public static void main(String[] args) {
        int[] piles = { 805306368,805306368,805306368};
        int h =   1000000000;
        int ans = mintime(piles,h);
        System.out.println(ans);
    }
    static int mintime(int[] piles, int h){
         int maxx = Integer.MIN_VALUE;
         int ans = 0;
        for(int i = 0; i<piles.length; i++){;
            maxx = Math.max(maxx, piles[i]);
        }
        int low = 1;

        while(low<=maxx){
              int mid  = low + (maxx - low) /2;
            int count = 0;
            for(int j = 0; j<piles.length; j++){
                    count = (int) (count + Math.ceil((double) piles[j] / mid));
            }
            if(count <= h){
                ans = mid;
                maxx = mid -1;
            }
            else{
                 low = mid + 1;
            }

        }
        return  ans;
    }
}
