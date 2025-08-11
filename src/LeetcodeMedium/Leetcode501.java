package LeetcodeMedium;
import java.util.*;

public class Leetcode501 {
    public static void main(String[] args) {
        int[] nums = {10,2,13,16,8,9,13};
        int ans = findit(nums);
        System.out.println(ans);
    }
    static int findit(int[] nums){
        HashSet<Integer> st = new HashSet<>();
        int maxx = Integer.MIN_VALUE;
        int mini = Integer.MAX_VALUE;
        for(int i = 0; i<nums.length; i++){
            st.add(nums[i]);
            maxx = Math.max(maxx, nums[i]);
            mini = Math.min(mini,nums[i]);
        }

        int upper = (int)Math.sqrt(maxx);
        int count = 1;
        int res = -1;
        for(int i = mini; i< upper+ 1; i++){
            int k = i;
            if(st.contains(i)) {
                while (st.contains(k * k)) {
                    count++;
                    k = k * k;
                }
            }
            res = Math.max(count,res);
            count = 1;
        }
        return res == -1 || res == 1 ? -1 : res;

    }
}
