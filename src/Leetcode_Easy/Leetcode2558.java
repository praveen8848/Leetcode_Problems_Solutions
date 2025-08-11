package Leetcode_Easy;

import java.util.Arrays;

public class Leetcode2558 {
    public static void main(String[] args) {
        int[] gifts = {70,58,12,11,41,66,63,14,39,71};
        int k = 19;
        long ans = findit(gifts, k);
        System.out.println(ans);
    }

    private static long findit(int[] gifts, int k) {
        long ans = 0;
        Arrays.sort(gifts);
         int i = gifts.length-1;
         while(k>0){
             int floor = (int)Math.floor(Math.sqrt(gifts[i]));
             int index = binarysearch(gifts, floor);
             int j = gifts.length-1;

             while(j>=1 && j>index+1){
                 gifts[j] = gifts[j-1];
                 j--;
             }
             gifts[j] = floor;
             k--;
         }
       for(int num: gifts){
           ans = ans + num;
       }
       return ans;
    }
    static int binarysearch(int[] nums, int target){
        int i = 0;
        int ans = -1;
        int j = nums.length-1;
        while(i<=j){
            int mid = i + (j-i)/2;
            if(nums[mid]<= target){
                ans = mid;
                i = mid+1;
            }
            else{
                j = mid-1;
            }
        }
        return ans;
    }
}
