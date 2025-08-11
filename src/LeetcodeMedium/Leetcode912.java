package LeetcodeMedium;

import java.util.Arrays;


public class Leetcode912 {
    public static void main(String[] args) {
        int[] nums = {-5,3,-2};
//        int[] ans = SelectionSort(nums);
//        System.out.println(Arrays.toString(ans));
        int[] ans2 = MergeSort(nums);
        System.out.println(Arrays.toString(ans2));

    }
    static int[] SelectionSort(int[] nums){
        int i = 0;
        int max = 0;
        while(i<nums.length) {
            for (int j = 0; j < nums.length - i; j++) {
                if (nums[j] > nums[max]) {
                    max = j;
                }
            }
            int last = nums.length-i-1;
            swap(nums,max, last);
            max = 0;
            i++;
        }
        return nums;
    }

    private static void swap(int[] nums, int max, int last) {
        int temp = nums[max];
        nums[max] = nums[last];
        nums[last] = temp;
    }


    static int[] MergeSort(int[] nums){
        if(nums.length == 1){
            return nums;
        }
        int mid = nums.length/2;
        int[] left = MergeSort(Arrays.copyOfRange(nums,0,mid));
        int[] right = MergeSort(Arrays.copyOfRange(nums,mid,nums.length));
        return MergeArrays(left,right);
    }

    private static int[] MergeArrays(int[] left, int[] right) {
        int[] mix = new int[left.length + right.length];
        int i = 0,j = 0,k = 0;
        while(i< left.length && j< right.length){
            if(left[i]<right[j]){
                mix[k] = left[i];
                i++;
            }
            else{
                mix[k] = right[j];
                j++;
            }
            k++;
        }
        while( i< left.length){
            mix[k] = left[i];
            i++;
            k++;
        }
        while(j< right.length){
            mix[k] = right[j];
            j++;
            k++;
        }
        
        return mix;
    }
}
