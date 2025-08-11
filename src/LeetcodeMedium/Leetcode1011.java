package LeetcodeMedium;

public class Leetcode1011 {
    public static void main(String[] args) {
        int[] weights = {1,2,3,4,5,6,7,8,9,10};
        int days = 1;
        int ans = findit(weights,days);
        System.out.println(ans);
    }

    private static int findit(int[] weights, int days) {
        int low = Integer.MIN_VALUE;
        int high = 0;
        int ans = 0;

        for(int i = 0; i<weights.length; i++){
            low = Math.max(low, weights[i]);
            high = high + weights[i];
        }

        while(low <=  high){
            int mid = low + (high - low)/2;

            if(f(mid, weights, days)){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }

        return ans;

    }
    static boolean f(int mid, int[] weights, int days){
        int count = 0;
        int sum = 0;
        int i = 0;
        while(i<weights.length){
            sum = sum + weights[i];
            if(sum <mid){
                i++;
            }
            else if(sum>mid){
                count++;
                sum = 0;
            }
            else {
                count++;
                sum = 0;
                i++;
            }
        }
        if(sum<mid &&  sum != 0){
            count++;
        }
        if(count<=days){
            return true;
        }

        return false;
    }
}
