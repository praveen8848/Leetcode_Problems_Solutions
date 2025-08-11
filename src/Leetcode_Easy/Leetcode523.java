package Leetcode_Easy;

import java.util.*;

public class Leetcode523 {
    public static void main(String[] args) {
        int[] nums = {5,0,0,0};
        int k = 3;
        boolean ans = findsubarraysum(nums,k);
        System.out.println(ans);
    }
    static boolean findsubarraysum(int[] nums, int k){
       int prefixmod = 0;
       HashMap<Integer, Integer> mp = new HashMap<>();
       mp.put(0,-1);

       for(int i = 0; i<nums.length; i++){
           prefixmod  = (prefixmod + nums[i])%k;

           if(mp.containsKey(prefixmod)){
               if(i-mp.get(prefixmod)>1){
                   return true;
               }
           }
           else{
               mp.put(prefixmod, i);
           }
        }
       return false;
    }
}
