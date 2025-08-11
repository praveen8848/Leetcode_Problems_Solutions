package LeetcodeMedium;

import java.util.HashMap;

public class Leetcode2573 {
    public static void main(String[] args) {
        int[] nums = {3,1,4,3,2,2,4};
        int k = 2;
        long ans = findit(nums, k);
        System.out.println(ans);
    }
    private static long findit(int[] nums, int k ){
        long ans = 0;
        int pair = 0;
        int i = 0;
        int j = 0;
        boolean flag = false;
        HashMap<Integer, Integer> mp = new HashMap<>();

        while(j<nums.length){
            pair = pair + mp.getOrDefault(nums[j],0);
            mp.put(nums[j], mp.getOrDefault(nums[j], 0) + 1);

            while(i<nums.length && pair>= k){
                ans += nums.length-j;
                int t = mp.get(nums[i]);
                if(t == 1){
                    mp.remove(nums[i]);
                }
                else{
                    mp.put(nums[i], t-1);
                }
                pair = pair - t+1;
                i++;
            }
            j++;
        }

        return ans;
    }
}
