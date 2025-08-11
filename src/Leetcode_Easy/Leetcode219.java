package Leetcode_Easy;
import java.util.*;

public class Leetcode219 {
    public static void main(String[] args) {
        int[] nums  = {1,0,1,1};
        int k = 1;
        boolean ans = checkit(nums,k);
        System.out.println(ans);
    }

    private static boolean checkit(int[] nums, int k) {
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i = 0;i<nums.length; i++){
            if(mp.containsKey(nums[i])){
                if(i - mp.get(nums[i]) <= k){
                    return true;
                }
                mp.put(nums[i],i);
            }
            else{
                mp.put(nums[i],i);
            }
        }
        return false;
    }
}
