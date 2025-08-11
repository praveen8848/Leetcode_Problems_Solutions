package LeetcodeMedium;

// https://leetcode.com/problems/single-number-iii/

//Given an integer array nums, in which exactly two elements appear
//only once and all the other elements appear exactly twice. Find the two
//elements that appear only once. You can return the answer in any order.
//You must write an algorithm that runs in linear runtime complexity and uses only constant extra space.


import java.util.Arrays;

public class Leetcode260 {
    public static void main(String[] args) {
       int[] nums = {0,1,2,2};
//       int[] ans = singleNumbers(nums);
//        System.out.println(Arrays.toString(ans));
        int[] anss = singleNumberss(nums);
        System.out.println(Arrays.toString(anss));
    }
    static int[] singleNumbers(int[] nums){
        int[] ans = new int[2];
        int k = 0;
        int m = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                while(i != j){
                    if(nums[i] == nums[j]){
                        m++;
                    }
                    break;
                }
            }
            if(m == 0){
                ans[k++] = nums[i];
            }
            m = 0;
        }
        return ans;
    }
    static int[] singleNumberss(int[] nums){
        int[] ans = new int[2];
        int k = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-1 && k<ans.length; i = i+2) {
            if(nums[i] != nums[i+1]){
                ans[k] = nums[i];
                k++;
                i = i-1;
            }
        }
        if(nums[nums.length-1] != nums[nums.length-2]){
            ans[1] = nums[nums.length-1];
        }
        return ans;
    }
}
