package Leetcode_Easy;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.Stack;

public class Leetcode496 {
    public static void main(String[] args) {
        int[] nums2 = {1,3,4,2};
        int[] nums1 = {4,1,2};
        int[] ans = nextGreaterElement(nums1, nums2);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        boolean checkit = true;
        int[] ans = new int[nums1.length];
        for(int i = 0; i<nums1.length; i++){
            for(int j = 0; j< nums2.length; j++){
                if(nums1[i] == nums2[j]){
                    int k = j;
                    while(k<nums2.length){
                        if(nums2[k]>nums2[j]){
                            ans[i] = nums2[k];
                            checkit = false;
                            break;
                        }
                        else{
                            k++;
                        }
                    }
                      break;
                }
            }
            if(checkit){
                ans[i] = -1;
            }
            checkit = true;
        }
        return ans;





    }
}
