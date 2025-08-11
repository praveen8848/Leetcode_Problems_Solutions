
//Given an array of integers nums and a positive integer k, check whether it is possible to divide this array into sets of k consecutive numbers.
//
//        Return true if it is possible. Otherwise, return false.

//https://leetcode.com/problems/divide-array-in-sets-of-k-consecutive-numbers/
// medium

import java.util.*;

public class Leetcode1296NotDone {
    public static void main(String[] args) {
        int[] nums = { 5,7,8,8,7,4,3,6};
        int k = 1;
        boolean ans = isPossibledivide(nums,k);
        System.out.println(ans);
    }
    static boolean isPossibledivide(int[] nums, int k){
       if(nums.length%k  != 0){
           return false;
       }

       int group = nums.length/k;
       int count = 0;
       int countgroup = 0;


       Map<Integer, Integer> mp = new HashMap<>();
       Arrays.sort(nums);

       for(int i = 0; i<nums.length; i++){
           mp.put(nums[i], mp.getOrDefault(nums[i],0) + 1);
       }

       int j = -1;
       int min = nums[0];
       int a = 0;
       while(j<nums.length){
           if(mp.containsKey(min) && count <k){
               if(mp.get(min)<=0){
                   System.out.println(mp.entrySet());
                   return false;
               }
               mp.put(min, mp.get(min) -1);
               min = min + 1;
               count++;
               j++;
           }
           else if(count == k){
               count = 0;
               countgroup++;
               a++;
               if(a >= nums.length){
                   j++;
                   break;
               }
               int m = nums[a];
               while(mp.containsKey(m) && a<nums.length){
                   if(mp.get(m)>0){
                       min = nums[a];
                       break;
                   }
                   a++;
                   if(a == nums.length){
                        break;
                   }
                   m = nums[a];
               }
           }
           else{
               if(countgroup != group) {
                   return false;
               }
               j++;
           }
       }
       if(countgroup != group){
          // System.out.println(mp.entrySet());
           return false;
       }


      return true;
    }
}
