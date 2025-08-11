package LeetcodeMedium;

public class Leetcode2226 {
    public static void main(String[] args) {
        int[] candies = {7,4,5};
         long k = 5;
        int ans =  findit(candies, k);
        System.out.println(ans);
    }
    static int findit(int[] candies,  long k){
       int realans = 0;
        int low = 1;
        int maxx  = Integer.MIN_VALUE;

        for(int i = 0; i<candies.length; i++){
            maxx = Math.max(maxx, candies[i]);
        }

        while(low<=maxx){
            int mid = low + (maxx - low)/2;
            long ans = 0;

            for(int j = 0; j<candies.length; j++){
                int n = candies[j];
                ans  = ans +  n/mid;
            }
            if(ans>=k){
                realans = (int)  mid;
                low = mid + 1;
            }
            else{
                maxx = mid - 1;
            }
        }
        return realans;
    }
}
