package Leetcode_Easy;

//https://leetcode.com/problems/separate-the-digits-in-an-array/


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode2553 {
    public static void main(String[] args) {
        int[] nums = {13,25,83,77};
        int[] ans = separateDigits(nums);
        System.out.println(Arrays.toString(ans));
    }
    static int[] separateDigits(int[] nums){
        int m = 0;
        List<Integer> ls = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nums.length; i++) {
            sb.append(nums[i]);
            for (int j = 0; j < sb.length(); j++) {
                char ch = sb.charAt(j);
                m =  Character.getNumericValue(ch);
                ls.add(m);
            }
            sb.delete(0,sb.length());
        }
        int[] ans = new int[ls.size()];
        for (int i = 0; i < ls.size(); i++) {
            ans[i] = ls.get(i);
        }
        return ans;
    }
}
