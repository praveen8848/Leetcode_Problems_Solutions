package LeetcodeMedium;

public class Leetcode1870 {
    public static void main(String[] args) {
        double hour = 1.9;
        int[] dist = {1,3,2};
        int ans = findits(dist, hour);
        System.out.println(ans);
    }

    private static int findits(int[] dist, double hour) {
        double ans = -1;
        int high = Integer.MAX_VALUE-1;
        int low  = 1;
        while(low<=high){
            int mid = low + (high-low)/2;
            double t = findit(dist, mid, hour);
            if(t>hour){
                low = mid + 1;
            }
            else{
                ans = mid;
                high = mid-1;
            }
        }
        return (int)ans;
    }
    public static double findit(int[] d, int m, double hour){
        double t = 0;
        for(int i = 0; i<d.length; i++){
            double tt =  (double) d[i] /m;
            if(i != d.length-1){
                tt = Math.ceil(tt);
            }
            t = t+tt;
            if(t> hour){
                break;
            }
        }
        return t;
    }
}
