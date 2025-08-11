package Leetcode_Easy;

//Given an integer array nums of positive integers, return the average value of all even integers that are divisible by 3.
//Note that the average of n elements is the sum of the n elements divided by n and rounded down to the nearest integer.



public class Leetcode2455 {
    public static void main(String[] args){
        int[] nums = {1, 3, 6, 10, 12, 15};
        int ans = averageValue(nums);
        System.out.println(ans);
    }
    static int averageValue(int[] nums) {
        int sum = 0;
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 6 == 0) {
                sum = sum + nums[i];
                k++;
            }
        }
        if(k!= 0){
            return sum/k;
        }
        return 0;
    }
}
