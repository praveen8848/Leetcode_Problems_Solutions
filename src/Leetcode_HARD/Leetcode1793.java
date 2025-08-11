package Leetcode_HARD;

public class Leetcode1793 {
    public static void main(String[] args) {
        int[] nums = {5,5,4,5,4,1,1,1};
        int k = 0;
        int ans = minsubarray(nums, k);
        System.out.println(ans);
    }

    private static int minsubarray(int[] nums, int k) {
        int i = k;
        if(k != 0){
            i = k-1;
        }
        int j = k+1;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        while(i > 0 || j < nums.length-1){
            int tempmin = Math.min(nums[i],nums[j]);
            if(tempmin<min){
                min = tempmin;
            }
            if(nums[i]>nums[j]){
                if (i>=1){
                    i--;
                }
            }
            if(nums[j] > nums[i]){
                if(j<nums.length-1) {
                    j++;
                }
            }
            int diff = (j-i+1);
            int  tempmax = min*diff;
            if(tempmax>max){
                max = tempmax;
            }
            if(j == nums.length-1 && i>0){
                i--;
            }
            if(!(j != nums.length - 1 || i >0)){
                j++;
            }
        }
        return max;
    }
}
