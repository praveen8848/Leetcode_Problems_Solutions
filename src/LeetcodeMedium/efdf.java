package LeetcodeMedium;

import java.lang.reflect.Array;
import java.util.Arrays;

public class efdf {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] ans = findit(nums, target);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] findit(int[] nums, int k){
        int i = 0;
        int[] ans = new int[2];
        int j = nums.length-1;
        while(i<j){
            if(nums[i] + nums[j] >k){
                j--;
            }
            else if(nums[i] + nums[j]<k){
                i++;
            }
            else{
                return new int[]{i, j};
            }
        }
        return ans;
    }
}
