package LeetcodeMedium;

public class Leetcode2594 {
    public static void main(String[] args) {
        int[] ranks = {1,3,1,2,1,1};
        int cars = 21;
        long ans = findit(ranks, cars);
        System.out.println(ans);
    }

    private static long findit(int[] ranks, int cars) {
        long low = 1;
        long high = (long) ranks[0] * cars * cars;

        while(low<high){
            long mid = low + (high - low)/2;

            long t = 0;
            for(int i = 0; i<ranks.length; i++){
                long tt = mid/ranks[i];
                tt = (long)Math.sqrt(tt);
                t = t + tt;
                if(t>=cars){
                    break;
                }
            }
            if(t>=cars){
                high = mid;
            }
            else{
                low = mid+1 ;
            }
        }
        return low;
    }
}
