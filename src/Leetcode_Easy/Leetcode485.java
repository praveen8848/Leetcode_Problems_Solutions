package Leetcode_Easy;


//Given a binary array nums, return the maximum number of consecutive 1's in the array.
// max Consecutive Ones


public class Leetcode485 {
    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1};
        int ans = findMaxConsecutiveOnes( nums);
        int anss = findMaxConsecutiveOne( nums);
        System.out.println(ans);
        System.out.println(anss);
    }

     static int findMaxConsecutiveOnes(int[] nums) {
        int i = 0;
        int max = 0;
         for (int j = 0; j < nums.length; j++) {
             if(nums[j] == 1){
                 i++;
                 if(i > max) max = i;
             }
             else{
                 i = 0;
             }
         }
         return max;
    }
    static int findMaxConsecutiveOne(int[] nums) {
        int i = 0;
        int max = Integer.MIN_VALUE;
        for (int j = 0; j < nums.length; j++) {
            if(nums[j] == 1){
                i++;
                max = Math.max(max,i);
            }
            else{
                i = 0;
            }
        }
        return max;
    }
}
