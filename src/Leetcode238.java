

//Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
//
//The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
//
//You must write an algorithm that runs in O(n) time and without using the division operation.
// medium

import java.util.Arrays;

public class Leetcode238 {
    public static void main(String[] args) {
      int[] nums = {1,2,3,4};
      int[] ans  =  productExceptSelf(nums);
        System.out.println(Arrays.toString(ans));
    }

  static int[] productExceptSelf(int[] nums) {
         int k = 1;
         int[] result = new int[nums.length];

      for (int i = 0; i < nums.length; i++) {
          result[i] = k;
          k = k*nums[i];
      }
      int l = 1;
      for (int i = nums.length-1; i>=0; i--) {
          result[i] = result[i]*l;
          l = l*nums[i];
      }
      return result;
    }
}
