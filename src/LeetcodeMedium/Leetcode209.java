package LeetcodeMedium;

//Given an array of positive integers nums and a positive integer target, return the minimal length of a
//        subarray
//whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.


public class Leetcode209 {
    public static void main(String[] args) {
        int[] nums = {2,3,1,2,4,3};
        int target = 7;
        int ans = minSubArraylen(nums, target);
        System.out.println(ans);
    }

    static int minSubArraylen(int[] nums, int target) {
        int min = Integer.MAX_VALUE;
        int sum = 0;
        int s = 0;
        int e = 0;
        while(e<nums.length){
            sum = sum + nums[e];
            if(sum<target){
               e++;
            }
            else if (sum >= target) {
                if(e-s + 1 < min){
                    min = e-s + 1;
                }
                while(sum>=target){
                    if(e-s + 1 < min){
                        min = e-s + 1;
                    }
                    sum = sum - nums[s];
                    s++;
                }
                e++;
            }

        }
        return (min == Integer.MAX_VALUE)? 0:min;
    }
}
