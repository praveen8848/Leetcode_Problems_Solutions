package Leetcode_Easy;

public class Leetcode643 {
    public static void main(String[] args) {
        int[] nums = {1,12,-5,-6,50,3};
        int k = 4;
         double ans = maximumavgsubarray(nums,k);
        System.out.println(ans);
    }

    private static double maximumavgsubarray(int[] nums, int k) {
        int i = 0;
        int j = 0;
        int sum = 0;
          float avg = Integer.MIN_VALUE;
          float max = 0;
        while(i<nums.length){
            sum = sum + nums[i];
            if(i-j+1 < k){
                i++;
            }
            else if(i-j + 1 == k){
                max  = sum;
                if(max>avg){
                  avg = max;
                }
                sum = sum - nums[j];
                i++;
                j++;
            }
        }

        return avg/1.0/k;
    }
}
