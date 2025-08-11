package LeetcodeMedium;


// Continuous Subarray Sum

//Given an integer array nums and an integer k, return true if nums has a good subarray or false otherwise.
//A good subarray is a subarray where:
//its length is at least two, and
//the sum of the elements of the subarray is a multiple of k.

public class Leetode523 {
    public static void main(String[] args) {
        int[] nums = {1,3,6,0,9,6,9};
        int k = 7;
        boolean ans = checksubarraysum(nums,k);
        System.out.println(ans);
    }
    static boolean checksubarraysum(int[] nums , int k){
//        int sum = 0;
//        int i = 0;
//        int j = 0;
//        while(j<nums.length){
//            sum = sum + nums[j];
//           if ( j - i + 1 == nums.length  && j - i + 1 >=2) {
//              if(sum%k == 0){
//                  return true;
//              }
//              while(sum%k != 0 && j - i + 1 >= 2){
//                   sum = sum-nums[i];
//                   i++;
//              }
//              if(sum%k == 0 && j-i+1 >=2){
//                  return true;
//              }
//              j++;
//          } else if (j-i+1>=2 && sum%k == 0) {
//              return true;
//          }
//           j++;
//        }
//        return false;

        int n = nums.length;

        // Edge case: If the array has less than two elements, no valid subarray exists.
        if (n < 2) {
            return false;
        }

        // Iterate over each starting point of subarrays
        for (int start = 0; start < n - 1; start++) {
            int sum = nums[start];

            // Check subarrays starting from `start` and having at least two elements
            for (int end = start + 1; end < n; end++) {
                sum += nums[end];

                // Check if the current subarray sum is a multiple of k
                if (k == 0) {
                    // Special case when k is zero: we look for subarray sum equal to 0.
                    if (sum == 0) {
                        return true;
                    }
                } else if (sum % k == 0) {
                    return true;
                }
            }
        }

        return false;
    }
}
