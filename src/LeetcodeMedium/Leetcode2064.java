package LeetcodeMedium;

public class Leetcode2064 {
    public static void main(String[] args) {
        int[] quantites = {15,10,10};
        int n = 7;
        int ans = minproduct(quantites,n);
        System.out.println(ans);
    }

    private static int minproduct(int[] quantites, int n) {
        int num = quantites.length;
        int ans = 0;
      //  int count = 0;
        int low = 1;
        int high = Integer.MIN_VALUE;
        for (int i = 0; i < num; i++) {
            high = Math.max(high, quantites[i]);

        }

        while(low<=high){
            int mid = low + (high - low)/2;

            int count = 0;
            for(int j = 0; j<num; j++){
                count  = count + (int) Math.ceil((double) quantites[j]/mid);
            }
            if(count<=n){
                ans = mid;
                high = mid - 1;
            }
            else {

                low  = mid + 1;
            }
        }
        return ans;
    }
}
