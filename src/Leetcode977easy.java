//Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.


import java.util.Arrays;

public class Leetcode977easy {
    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        int[] ans = squareandsort(nums);
        System.out.println(Arrays.toString(ans));
    }

     static int[] squareandsort(int[] nums) {
          int[] rest = new int[nums.length];
        int n = nums.length;
        int left = 0, right = n-1;
        int index = n-1;
        while(left <= right){
            int leftnumber = nums[left]*nums[left];
            int rightnumber = nums[right]*nums[right];
            if(leftnumber>rightnumber){
                rest[index] = leftnumber;
                left++;
            }
            else{
                rest[index] = rightnumber;
                right--;
            }
            index--;
        }
       return rest;
     }
}
