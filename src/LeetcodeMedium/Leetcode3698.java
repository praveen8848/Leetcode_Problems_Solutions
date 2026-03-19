package LeetcodeMedium;

public class Leetcode3698 {
    public static void main(String[] args) {
        int[] nums = {6,7,3};
        System.out.println(splitArray(nums));
    }

    private static long splitArray(int[] nums) {
        for(int i =1; i<nums.length-1; i++){
            if(nums[i]<=nums[i-1] && nums[i]<=nums[i+1]){
                return -1;
            }
        }
        int n = nums.length;
        long[] prefix = new long[n];
        long[] suffix = new long[n];
        prefix[0] = nums[0];
        suffix[n-1] = nums[n-1];
        boolean checkit = true;
        boolean checkit2 = true;
        for(int i= 1; i<nums.length; i++){
            if(nums[i-1]<nums[i] && checkit){
                prefix[i] = prefix[i-1]+ nums[i];
            }
            else{
                checkit = false;
            }

            if(nums[n-1-i]>nums[n-i] && checkit2){
                suffix[n-1-i] =  suffix[n-i] + nums[n-1-i];
            }
            else{
                checkit2 = false;
            }
        }

        long ans = Long.MAX_VALUE;

        for(int i = 0; i<n-1; i++){
            long prefixSum = prefix[i];
            long suffixSum = suffix[i+1];

            if(prefixSum != 0 && suffixSum != 0){
                long diff = suffixSum - prefixSum;
                if(diff<0) diff = -diff;
                ans = Math.min(ans, diff);
            }
        }
        return ans;
    }
}
