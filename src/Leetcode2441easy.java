
//https://leetcode.com/problems/largest-positive-integer-that-exists-with-its-negative/

import java.util.ArrayList;
import java.util.List;

public class Leetcode2441easy {
    public static void main(String[] args) {
       int[] nums  = {-1,2,-3,3};
       int ans = FindMaxK(nums);
        System.out.println(ans);
        //int[] nss = new int[99];
    }
    static int FindMaxK(int[] nums){
         int i = 0;
         int max = -1;
         while(i< nums.length){
             if(nums[i]<0){
                 for (int j = 0; j < nums.length; j++) {
                     if(-(nums[i]) == nums[j]){
                         if(nums[j]>max){
                             max = nums[j];
                         }
                     }
                 }
                 i++;
             }
             else{
                 i++;
             }
         }
         return max;
    }
}
