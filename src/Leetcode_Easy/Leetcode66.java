package Leetcode_Easy;

import java.math.BigInteger;
import java.util.Arrays;

public class Leetcode66 {
    public static void main(String[] args) {
        int[] digits = {9,8,7,6,5,4,3,2,1,0};
        int[] ans = findit(digits);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] findit(int[] digits) {
        boolean flag = false;
        for(int i = digits.length-1; i>=0; i--){
            if(digits[i] + 1 == 10){
                digits[i] = 0;
                flag = true;
            }
            else{
                digits[i] = digits[i]+1;
                return digits;
            }
        }
        if(flag){
            int[] ans = new int[digits.length + 1];
            ans[0] = 1;
            return ans;
        }
        return digits;
    }
}
