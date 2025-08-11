package LeetcodeMedium;

import java.util.Arrays;

public class Leetcode2530 {
    public static void main(String[] args) {
        int[] nums = {756902131,995414896,95906472,149914376,387433380,848985151};
        int k = 6;
        long ans = findit(nums,k);
        System.out.println(ans);
    }

    private static long findit(int[] nums, int k) {
        long ans = 0;
        Arrays.sort(nums);

        for(int i = nums.length-1;i>=0 && k>0; i--){
            ans = ans + nums[i];
            nums[i] = Math.ceilDiv(nums[i],3);
            k--;
            if(k>0 && i>0){
                while(nums[i]>nums[i-1] && k>0){
                    ans = ans + nums[i];
                    nums[i] = Math.ceilDiv(nums[i],3);
                    k--;
                }
            }
            else {
                while(k>0){
                    ans = ans + nums[i];
                    nums[i] =  Math.ceilDiv(nums[i],3);
                    k--;
                }
            }
        }
        return ans;
    }
}
