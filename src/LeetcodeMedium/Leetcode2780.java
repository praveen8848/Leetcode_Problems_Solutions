package LeetcodeMedium;

import java.util.*;

public class Leetcode2780 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(2);
        nums.add(2);
        int ans = findit(nums);
        System.out.println(ans);
    }

    private static int findit(List<Integer> nums) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int i = 0; i<nums.size(); i++){
            mp.put(nums.get(i), mp.getOrDefault(nums.get(i), 0) +1);
        }
        HashMap<Integer, Integer> mp2 = new HashMap<>();
        int mid = nums.size()/2;
        for(int i = 0; i<nums.size(); i++){
            int t = nums.get(i);
            mp2.put(nums.get(i), mp2.getOrDefault(nums.get(i), 0) +1);
            if(mp.get(nums.get(i)) > mid){
                int m = (i+1)/2;
                int n = mp.get(t)-mp2.get(t);
                int a = mp2.get(t);
                int h = (nums.size()- (i+1))/2;
                if(a> m && n >h){
                    return i;
                }
            }
        }
        return -1;
    }
}
