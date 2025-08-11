package LeetcodeMedium;

public class Leetcode2187 {
    public static void main(String[] args) {
        int[] time = {10000};
        int totalTrips = 10000000;
        long ans = findit(time, totalTrips);
        System.out.println(ans);
    }

    private static long findit(int[] time, int totalTrips) {
        long low  = 1;
        long high = 0;
         int minimum  = Integer.MAX_VALUE;
        for(int i = 0; i<time.length; i++){
            minimum = Math.min(minimum, time[i]);
        }
        high = (long) minimum *totalTrips;
        long ans = 0;
        while(low<=high){
            long mid = low + (int)(high - low)/2;
            long count = 0;

            for(int i = 0; i<time.length; i++){
                count = count + mid/time[i];
            }

            if(count<totalTrips){
                low = mid + 1;
            }
            else{
                ans = mid;
                high = mid - 1;
            }
        }
        return ans;
    }
}
