package LeetcodeMedium;

import java.util.HashMap;
import java.util.Map;


public class Leetcode2521 {
    public static void main(String[] args) {
        int[] nums = {2,4,3,7,10,6};
        int ans = countdistinctprime(nums);
        System.out.println(ans);
    }

    private static int countdistinctprime(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = 2; j <= nums[i]; j++) {
                while (nums[i]%j == 0){
                    if(mp.isEmpty()){
                        mp.put(j,1);
                    }
                    else{
                        if(mp.containsKey(j)){
                            mp.put(j, mp.get(j)+1);
                        }
                        else{
                            mp.put(j, j+1);
                        }
                    }
                    nums[i] = nums[i]/j;
                }
            }
        }
        int x = mp.size();
        return x;
    }
}
