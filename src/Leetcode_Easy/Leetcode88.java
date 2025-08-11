package Leetcode_Easy;

import java.util.Arrays;

public class Leetcode88 {
    public static void main(String[] args) {
        int[] nums1  = {1};
        int[] nums2 = {};
        merge(nums1, nums2);
        System.out.println(Arrays.toString(nums1));
    }
    static void merge(int[] nums1, int[] nums2){
        int[] ans = new int[nums1.length];
        int k = 0;
        int i = 0;
        int j = 0;
        while(i<nums1.length-nums2.length && j<nums2.length){
            if(nums1[i] <= nums2[j]){
                ans[k] = nums1[i];
                i++;
            }
            else if(nums2[j] <= nums1[i]){
                ans[k] = nums2[j];
                j++;
            }
            k++;
        }
        while(k<ans.length && j<nums2.length){
            ans[k]  = nums2[j];
            k++;
            j++;
        }
        while(k<ans.length && i<nums1.length-nums2.length){
            ans[k]  = nums1[i];
            k++;
            i++;
        }
        for (int l = 0; l < ans.length; l++) {
            nums1[l] = ans[l];
        }
    }
}
