package LeetcodeMedium;

import java.util.Arrays;

public class Leetcode2161 {
    public static void main(String[] args) {
        int[] nums = {-3,4,3,2};
        int pivot = 2;
        int[] ans = arrangeit(nums,pivot);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] arrangeit(int[] nums, int pivot) {
        int pivotcount = 0;
        int s = 0;
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]<pivot){
                ans[s] = nums[i];
                s++;
            }
            else if(nums[i] == pivot){
                pivotcount++;
            }
        }
        while(pivotcount>0){
            ans[s] = pivot;
            pivotcount--;
            s++;
        }
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>pivot){
                ans[s] = nums[i];
                s++;
            }
        }
        return  ans;
    }
}
