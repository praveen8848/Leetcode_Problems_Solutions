package LeetcodeMedium;

import java.util.*;

public class Leetcode3169 {
    public static void main(String[] args) {
        int[][] meetings = {{3,4},{4,8},{2,5},{3,8}};
        int days = 8;
        int ans = findit(meetings, days);
        System.out.println(ans);
    }

    private static int findit(int[][] meetings, int days) {
        Arrays.sort(meetings, Comparator.comparingInt(a -> a[0]));
        int ans = 0;
        int end = 0;
        for(int i = 0; i<meetings.length; i++){
            int s = meetings[i][0];
            int current_end = meetings[i][1];
            if(s>end+1){
                ans = ans + s - end -1;
            }
            end = Math.max(end, current_end);
        }
        ans = ans + days - end;
        return  ans;
    }
}
