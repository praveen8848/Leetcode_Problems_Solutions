package Leetcode_Easy;

import java.util.HashMap;
import java.util.Map;

public class Leetcode2404 {
    public static void main(String[] args) {
        int[] nums = {0,1};
        int ans = findit(nums);
        System.out.println(ans);
    }

    private static int findit(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<>();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i<nums.length;i++){
            if(nums[i]%2 == 0 && mp.isEmpty()){
                mp.put(nums[i], 1);
            }
            else if(mp.containsKey(nums[i])){
                mp.put(nums[i], mp.get(nums[i]) + 1);
            }
            else if(nums[i]%2 == 0){
                mp.put(nums[i],1);
            }
        }
        System.out.println(mp);
        for(var e : mp.entrySet()){
            if(e.getValue() >max ){
                max = e.getValue();
                min = e.getKey();
            }
            else if( e.getValue() == max){
                if(e.getKey()<min){
                    min = e.getKey();
                }
            }
        }
        return min == Integer.MAX_VALUE? min = -1: min;
    }
}
