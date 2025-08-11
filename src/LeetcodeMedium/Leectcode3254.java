package LeetcodeMedium;

import java.util.Arrays;

public class Leectcode3254 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,3,2,5};
        int k = 3;
        int[] ans = findit(nums,k);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] findit(int[] nums, int k) {
        int[] ans = new int[nums.length-k + 1];
        int m = 0;
        for(int i = 0; i<nums.length-k+1; i++){
            int maxx = nums[i];
            boolean flag = true;
            for(int j = i+1; j-i <k && j< nums.length; j++){
                if(nums[j]-nums[j-1] != 1){
                    flag = false;
                }
                maxx = Math.max(maxx,nums[j]);
            }
            if(flag && m < ans.length){
                ans[m] = maxx;
            }
            else{
                if(m<ans.length){
                    ans[m] = -1;
                }

            }
            m++;
        }
        return ans;
    }

}
