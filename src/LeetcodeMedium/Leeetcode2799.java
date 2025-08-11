package LeetcodeMedium;

import java.util.HashMap;
import java.util.HashSet;

public class Leeetcode2799 {
    public static void main(String[] args) {
        int[] nums = {1,3,1,2,2};
        int ans = findit(nums);
        System.out.println(ans);
    }
    private static int findit(int[] nums){
        int n = nums.length;
        HashMap<Integer, Integer> mp = new HashMap<>();

        for(int i : nums){
            mp.put(i, mp.getOrDefault(i, 0) + 1);
        }

        int t = mp.size();
        HashMap<Integer, Integer> s = new HashMap<>();
        int i = 0;
        int j = 0;
        int ans = 0;

        while(i<nums.length){
            s.put(nums[i], s.getOrDefault(nums[i], 0) + 1);

            while(j<n && s.size()>= t){
                ans = ans + n-i;
                s.put(nums[j], s.get(nums[j])-1);
                if(s.get(nums[j]) == 0){
                    s.remove(nums[j]);
                }
                j++;
            }
            i++;
        }
        return ans;
    }
}
