package LeetcodeMedium;

import java.util.HashMap;

public class Leetcode2453 {
    public static void main(String[] args) {
        int[] nums = {1,3,5,2,4,6};
        int space = 2;
        int ans = findit(nums, space);
        System.out.println(ans);
    }
    public static int findit(int[] nums, int space){
        HashMap<Integer, Integer> rem = new HashMap<>();
        HashMap<Integer, Integer> count = new HashMap<>();

        for(int i = 0; i<nums.length; i++){
            int r = nums[i]%space;
            rem.put(r, Math.min(rem.getOrDefault(r, Integer.MAX_VALUE), nums[i]));
            count.put(r, count.getOrDefault(r, 0)+1);
        }
        int c = Integer.MIN_VALUE;
        int ans = Integer.MAX_VALUE;
        for(var e : count.entrySet()){
            if(e.getValue() == c ){
                c = e.getValue();
                ans = Math.min(ans, rem.get(e.getKey()));
            }
            else if(e.getValue() > c ){
                c = e.getValue();
                ans = rem.get(e.getKey());
            }

        }
        return ans;
    }
}
