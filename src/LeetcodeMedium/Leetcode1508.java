package LeetcodeMedium;

import java.util.Arrays;

public class Leetcode1508 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int n = 4;
        int left = 3;
        int right = 4;
        int ans = subarraySum(nums, n, left, right);
        System.out.println(ans);
    }

    private static int subarraySum(int[] nums, int n, int left, int right) {
        int len = n*(n+1)/2;
        int[] temp = new int[len];
        long sum = 0;
        int m = 0;
        long subArraysums = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                for (int k = i; k <= j ; k++) {
                   sum = sum + nums[k];
                }
                temp[m] = (int)sum;
                sum = 0;
                m++;
            }
        }

        Arrays.sort(temp);

        for (int i = left-1; i < right; i++) {
            subArraysums = subArraysums + temp[i];
        }
        return (int)(subArraysums % 1000000007);
    }
}
