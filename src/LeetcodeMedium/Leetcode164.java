package LeetcodeMedium;



//Given an integer array nums, return the maximum difference between two successive
// elements in its sorted form. If the array contains less than two elements, return 0.
//You must write an algorithm that runs in linear time and uses linear extra space.



public class Leetcode164 {
    public static void main(String[] args) {
        int[] nums = {1,5,87,4,76};
        int ans =  MaximumGap(nums);
        System.out.println(ans);
    }
    static int MaximumGap(int[] nums){
        if(nums.length <2){
            return 0;
        }
        int maximum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length-i-1; j++) {
                if(nums[j]>nums[j+1]){
                    swap(nums,j,j+1);
                }
            }
        }

        for (int j = 0; j < nums.length-1; j++) {
            if(nums[j+1]-nums[j] > maximum){
               maximum = nums[j+1] - nums[j];
            }
        }
        return maximum;
    }
    static void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
