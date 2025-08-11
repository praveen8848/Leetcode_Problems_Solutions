package LeetcodeMedium;

import java.util.*;

public class Leetcode3097 {
    public static void main(String[] args) {
        int[] nums = {1,2,32,21};
        int k =55;
        int ans = findit(nums, k);
        System.out.println(ans);
    }
    static int findit(int[] nums, int k ){
        HashMap<Integer, Integer> mp = new HashMap<>();
        int minimum = Integer.MAX_VALUE;
        int s = 0;
        boolean flag = false;
        int ans = 0;
        for(int i = 0; i<nums.length; i++){
            if(!mp.containsKey(nums[i])){
                mp.put(nums[i],i);
            }
        }
        for(var e: mp.entrySet()){
            if(e.getKey()>k){
                s = e.getValue();
                minimum = Math.min(minimum, s);
                flag = true;
            }
        }
        if(flag){
            if((nums[s] | nums[s]) > k){
                ans++;
                return ans;
            }
        }
        int i = 0;
        int j = 0;
        int bitwiseor = 0;

        while (i < nums.length) {
            // Expand the window to include nums[i]
            bitwiseor |= nums[i];

            // Shrink the window from the left if bitwiseor meets or exceeds k
            while (bitwiseor >= k) {
                // Calculate the current subarray length
                minimum = Math.min(minimum, i - j + 1);

                // Shrink the window by removing nums[j] influence on bitwiseor
                bitwiseor ^= nums[j];
                j++;
            }

            // Move to the next element
            i++;
        }
        return minimum;
    }
}
