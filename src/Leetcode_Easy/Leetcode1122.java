package Leetcode_Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Leetcode1122 {
    public static void main(String[] args) {
        int[] nums1 = {2,3,1,3,2,4,6,7,9,2,19};
        int[] nums2 = {2,1,4,3,9,6};
        int[] ans = relativeSortArray(nums1,nums2);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] relativeSortArray(int[] arr1, int[] arr2) {
        int k = 0;
        int l = 0;
        List<Integer> temp = new ArrayList<>();
        int[] ans  = new int[arr1.length];
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if(arr2[i] == arr1[j]){
                    ans[k] = arr1[j];
                    k++;
                }
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if(arr2[j] == arr1[i]){
                    l++;
                }
            }
            if(l == 0){
                 temp.add(arr1[i]);
            }
            l = 0;
        }
        Collections.sort(temp);
        for (int i = 0; i < temp.size(); i++) {
                ans[k] = temp.get(i);
                k++;

        }
        return ans;
    }
}
