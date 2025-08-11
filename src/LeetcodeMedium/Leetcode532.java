package LeetcodeMedium;

import java.util.*;

public class Leetcode532 {
    public static void main(String[] args) {
        int[] nums = {3,1,4,1,5};
        int k = 2;
        int ans = countit(nums,k);
        System.out.println(ans);
    }
    static int countit(int[]nums, int k ){
        int count = 0;
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            mp.put(nums[i], mp.getOrDefault(nums[i],0)+1);
        }

        for(var e : mp.entrySet()){
            if(k == 0){
                if(e.getValue()>=2){
                    count++;
                }
            }
            else{
                if(mp.containsKey(e.getKey() + k)){
                    count++;
                }
            }
        }
        return count;
    }
}
