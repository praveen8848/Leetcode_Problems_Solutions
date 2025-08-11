package LeetcodeMedium;

import java.util.Arrays;

public class Leetcode2007 {
    public static void main(String[] args) {
        int[] changed = {1,3,4,2,6,8};
        int[] ans = findit(changed);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] findit(int[] changed) {
        Arrays.sort(changed);
        int[] ans2 = new int[0];
        if(changed.length%2 != 0){
            return new int[0];
        }
        int j = changed.length/2;
        int[] ans = new int[j];
        for (int i = 0; i < changed.length && j <changed.length; i++, j++) {
            if(changed[i]%2 != 0){
                ans[i] = changed[i];
            }
            else{
                return ans2;
            }
        }
        return ans;
    }
}
