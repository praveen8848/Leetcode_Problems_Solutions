package LeetcodeMedium;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Stack;

public class Leetcode503 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,3};
        int[] ans = nextgreater2(nums);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] nextgreater2(int[] nums) {
        Stack<Integer> st = new Stack<>();
        boolean checkit = true;
        int[] temp = new int[2*nums.length];
        for (int i = 0; i < nums.length; i++) {
            temp[i] = nums[i];
        }
        int k = temp.length/2;
        for (int j = 0; j < nums.length; j++) {
            if(k<temp.length) {
                temp[k] = nums[j];
                k++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            int x = i;
            while (x < i + nums.length - 1){
                if(temp[x + 1]>temp[i]){
                    nums[i] = temp[x+1];
                    checkit = false;
                    break;
                }
                else {
                    x++;
                }
            }
            if(checkit){
                nums[i] = -1;
            }
            else {
                checkit = true;
            }
        }
      return nums;
    }
}
