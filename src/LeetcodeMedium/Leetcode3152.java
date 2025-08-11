package LeetcodeMedium;

import java.util.Arrays;
import java.util.Comparator;

public class Leetcode3152 {
    public static void main(String[] args) {
        int[] nums = {4,3,1,6};
        int[][] queries  = {{0,2}, {2,3}};
        boolean[] ans = findit(nums, queries);
        System.out.println(Arrays.toString(ans));
    }

    private static boolean[] findit(int[] nums, int[][] queries) {
        boolean[] ans = new boolean[queries.length];
         int[] prefix = new int[nums.length];
         prefix[0] = 0;

        for (int i = 1; i < nums.length; i++) {
            if(nums[i]%2 == nums[i-1]%2){
                prefix[i] = prefix[i-1] + 1;
            }
            else{
                prefix[i] = prefix[i-1];
            }
        }
        for (int i = 0; i < queries.length; i++) {
            int[] temp = queries[i];
            int j = temp[0];
            int k = temp[1];

            if(prefix[k] -prefix[j] == 0){
                ans[i] = true;
            }
            else{
                ans[i] = false;
            }
        }
        return ans;
    }
}
