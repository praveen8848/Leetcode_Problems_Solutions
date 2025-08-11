package LeetcodeMedium;

import java.util.Map;
import java.util.Stack;

public class Leetcode769 {
    public static void main(String[] args) {
        int[] arr = {0,4,5,2,1,3};
        int ans = maxchuncks(arr);
        System.out.println(ans);
    }

    private static int maxchuncks(int[] arr) {
        int count = 0;
        int max = 0;
        if(arr == null|| arr.length == 0){
            return 0;
        }
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
            if(max == i){
                count++;
            }
        }
        return count;
    }
}
