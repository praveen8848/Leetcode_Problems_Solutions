package LeetcodeMedium;

import java.util.ArrayList;

public class Leetcode1208 {
    public static void main(String[] args) {
        String s =   "krpgjbjjznpzdfy";
        String t =    "nxargkbydxmsgby";
        int maxCost = 19;
        int ans = maxcost(s,t,maxCost);
        System.out.println(ans);
    }

    private static int maxcost(String s, String t, int maxCost) {
        int max  = 0;
        int diff = 0;
        int ans = 0;
        int i = 0;
        int j = 0;
        while (i<s.length()){
            diff = Math.abs(s.charAt(i) - t.charAt(i));
            ans = ans + diff;

            while(ans>maxCost){
                diff = Math.abs(s.charAt(j) - t.charAt(j));
                ans = ans - diff;
                j++;
            }


            max = Math.max(max, i-j+1);

            i++;
        }
        ArrayList<Integer> lst = new ArrayList<>();
        return max;

    }
}
