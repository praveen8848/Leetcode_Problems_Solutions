package LeetcodeMedium;

import java.util.*;

public class Leetcode560 {
    public static void main(String[] args) {
        int[] nums = {1,2,1,2,1};
        int k = 3;
        int ans = subarraySum(nums,k);
        System.out.println(ans);
    }

    private static int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        mp.put(0,1);
        int sum = 0;
        int count = 0;

        for(int i = 0;i<nums.length; i++){
            sum = sum + nums[i];
            if(mp.containsKey(sum-k)){
                count = count + mp.get(sum - k);
            }
            mp.put(sum, mp.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}
