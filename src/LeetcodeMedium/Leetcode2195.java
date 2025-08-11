package LeetcodeMedium;

import java.util.*;

public class Leetcode2195 {
    public static void main(String[] args) {
        int[] nums = {93,44,49,45,93,52,6,7,88,70,86,15,38,86,86,95,8,62,13,84,26,16,33,85,7,62,55,50,77,10,76,10,35,67,19,12,24,39,76,37};

        int k = 17;
        long ans = findit(nums, k);
        System.out.println(ans);
    }
    static long findit(int[] nums, int k){
        long sum = 0;
        HashSet<Integer> st = new HashSet<>();
        Arrays.sort(nums);

        for(int i: nums){
            if(!st.contains(i) && i<=k){
                k++;
                sum =sum + i;
            }
            st.add(i);
        }
        long ans = (long)(k+1)*k/2 - sum;
        return ans;
    }
}
