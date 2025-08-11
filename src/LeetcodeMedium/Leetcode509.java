package LeetcodeMedium;

// You need to work on it, incomplete.

//https://leetcode.com/problems/subarray-sum-equals-k/

//Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.
//
//A subarray is a contiguous non-empty sequence of elements within an array.


public class Leetcode509 {
    public static void main(String[] args) {
      int[] nums = {1,2,3};
      int k = 0;
      int ans = subarraySum(nums,k);
        System.out.println(ans);
    }
    static int subarraySum(int[] nums, int k){
        int sum = 0;
        int m = 0;
        int s = 0,e = 0;
        while(e<nums.length){
            sum = sum + nums[e];
            if(sum<k){
                e++;
            } else if (sum == k) {
                m++;
                e++;
            } else if (sum>k) {
                while(sum>k){
                    sum = sum - nums[s];
                    s++;
                }
                if (sum == k) {
                    m++;
                    e++;
                }
            }
        }
        return m;
    }
}
