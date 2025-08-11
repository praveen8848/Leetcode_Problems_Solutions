package LeetcodeMedium;

import java.util.Arrays;

public class Leetcode75 {
    public static void main(String[] args) {
        int[] nums = {1,2,0};
        sortColors(nums);
    }
    static void sortColors(int[] nums){
//        int j = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if(nums[i] == 0){
//                int temp = nums[i];
//                nums[i] = nums[j];
//                nums[j] = temp;
//                j++;
//            }
//        }
//        for (int   m = 0;   m < nums.length;   m++) {
//            if(nums[m] == 1){
//                int temp = nums[ m];
//                nums[m] = nums[j];
//                nums[j] = temp;
//                j++;
//            }
//        }
//        System.out.println(Arrays.toString(nums));
       int i = 0;
       int j = 0;
       int e = nums.length-1;
       while(j<=e){
           if(nums[j] == 0){
               int temp = nums[j];
               nums[j] = nums[i];
               nums[i] = temp;
               i++;
               j++;
           }
           else if(nums[j] == 1){
               j++;
           }
           else if(nums[j] == 2){
               int temp = nums[j];
               nums[j] = nums[e];
               nums[e] = temp;
               e--;
               j++;
           }
       }
        System.out.println(Arrays.toString(nums));

    }
}
