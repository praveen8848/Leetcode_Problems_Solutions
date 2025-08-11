package Leetcode_Easy;

import java.util.Arrays;

public class Leetcode2465 {
    public static void main(String[] args) {
        int[] nums = {9,5,7,8,7,9,8,2,0,7};
        int ans = distinctAverages(nums);
        System.out.println(ans);
    }

    private static int distinctAverages(int[] nums) {
        float[] arr =  new float[nums.length/2];
        int count = 1;
        float sum = 0;
        Arrays.sort(nums);
        int i = 0;
        int j = nums.length-1;
        while(i<j){
            sum = (float) (nums[i] + nums[j]) /2;
            arr[i] = sum;
            i++;
            j--;
        }
        Arrays.sort(arr);
        for(int k = 1; k<arr.length; k++){
            if(arr[k-1] != arr[k]){
                count++;
            }
        }
        return count;
    }
}
