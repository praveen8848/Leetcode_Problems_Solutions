package LeetcodeMedium;

import java.util.Arrays;

public class Leetcode945 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 3, 3, 4, 5};
        int ans = minincrement(nums);
        System.out.println(ans);
    }

    private static int minincrement(int[] nums) {
//        int s = 0;
//        Arrays.sort(nums);
//        int i = 1;
//        while(i<nums.length){
//           if(nums[i-1] == nums[i]){
//               nums[i] += 1;
//               s++;
//               i++;
//           }
//           else if(nums[i]<nums[i-1]){
//               int diff = Math.abs(nums[i] -nums[i-1]);
//               nums[i] = nums[i] + diff +1;
//               s = s + diff + 1;
//               i++;
//           }
//            else {
//                i++;
//           }
//        }
//        System.out.println(Arrays.toString(nums));
//        return s;

        int ans  = 0;
        int next = 0;
        for (int i = 0; i < nums.length; i++) {
          if(nums[i]<next){
              ans = ans + next-nums[i];
          }
          else{
              next = nums[i];
          }
          next++;
        }
        return  ans;
    }
}
