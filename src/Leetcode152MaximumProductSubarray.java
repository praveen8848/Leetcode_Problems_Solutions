
// not Done
//Given an integer array nums, find a
//subarray
//that has the largest product, and return the product.
//
//The test cases are generated so that the answer will fit in a 32-bit integer.


import java.util.Arrays;

public class Leetcode152MaximumProductSubarray {
    public static void main(String[] args) {
        int[] nums = {-1,4,-4,5,-2,-1,-1,-2,-3, 0, 3};
        int ans = maxProduct(nums);
        System.out.println(ans);
    }
    static int maxProduct(int[] nums){
        int max = 0;
        if(nums.length == 1){
            return nums[0];
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j <= nums.length ; j++) {
                int[] subarray = Arrays.copyOfRange(nums,i,j);
                int finale = findit(subarray,1);
                if(finale>max){
                    max = finale;
                }
            }
        }
        return max;
    }
    static int findit(int[] subarray, int product){
        for (int i = 0; i < subarray.length; i++) {
            product = product*subarray[i];
        }
        return product;
    }
}
