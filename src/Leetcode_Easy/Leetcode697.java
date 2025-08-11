package Leetcode_Easy;

import java.util.HashMap;

public class Leetcode697 {
    public static void main(String[] args) {
        int[] nums = {1,2,2,3,1};
        int ans = findit(nums);
        System.out.println(ans);
    }
    public static int findit(int[] nums){
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            mp.put(nums[i], mp.getOrDefault(nums[i],0) + 1);
        }
        int maxx = 0;

        for(var e : mp.entrySet()){
            maxx = Math.max(maxx, e.getValue());
        }

        int i = 0;
        int j = 0;
        int ans = Integer.MAX_VALUE;


        HashMap<Integer, Integer> mp2 = new HashMap<>();
        while(i<nums.length){
            int count = 0;
            mp2.put(nums[i], mp2.getOrDefault(nums[i], 0) + 1);
            count = mp2.get(nums[i]);
            while(count>= maxx){
                ans = Math.min(ans, i-j+1);
                mp2.put(nums[j], mp2.getOrDefault(nums[j],0)-1);
                if(mp.get(nums[j])<=0){
                    mp.remove(nums[j]);
                }
                if(nums[j] == nums[i]){
                    count--;
                }
                j++;
            }
            i++;
        }
        return ans;
    }
}
