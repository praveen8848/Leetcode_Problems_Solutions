package LeetcodeMedium;

import java.util.Arrays;

public class Leetcode2233 {
    public static void main(String[] args) {
        int[] nums = {6,3,3,2};
        int k = 2;
        int ans = maxProduct(nums,k);
        System.out.println(ans);
    }

    private static int maxProduct(int[] nums,int k) {
        int product = 1;
        int temp = 1;
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if(nums[i-1] - nums[i] != 0){
                break;
            }
            else {
                temp++;
            }
        }
        if( temp == nums.length){
            temp = 0;
             while(k>0){
                 nums[temp] = nums[temp] + 1;
                 k--;
                 temp++;
                 if(temp == nums.length-1){
                     temp = 0;
                 }
             }
            for (int i = 0; i < nums.length; i++) {
                product = product*nums[i];
            }
        }
        else{
            nums[0] = nums[0]+k;
            for (int i = 0; i < nums.length; i++) {
                product = product*nums[i];
            }
        }
        return (int)(product% (Math.pow(10,9) + 7));
    }
}
