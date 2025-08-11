package LeetcodeMedium;

import java.util.HashMap;
import java.util.*;

public class Leetcode1590 {
    public static void main(String[] args) {
        int[] nums = {1000000000,1000000000,1000000000};
        int p = 3;
        int ans = findit(nums,p);
        System.out.println(ans);
    }

    private static int findit(int[] nums, int p) {
        Map<Integer, Integer> mp = new HashMap<>();
        mp.put(0,-1);
        int minlength = Integer.MAX_VALUE;
        int n = 0;

         long sum = 0;
        for(int i = 0; i<nums.length; i++){
            sum = sum + nums[i];
        }

        long target = (int) sum%p;
        if(target == 0 || target == -1){
            return 0;
        }

        int prefixSum = 0;
        int needed = 0;

        for(int i = 0; i<nums.length;  i++){
            prefixSum = (nums[i] +  prefixSum)%p;
            needed = (int) ((prefixSum - target + p)%p);
            if (mp.containsKey(needed)) {
                n = i - mp.get(needed);
                minlength = Math.min(minlength,n);
            }
            mp.put(prefixSum,i);
        }
        return minlength == nums.length ? -1: minlength;
    }
}
