package Leetcode_HARD;

import java.util.*;

public class Leetcode2561 {
    public static void main(String[] args) {
        int[] basket1 = {4,2,2,2};
        int[] basket2 = {1,4,1,2};
        long ans = findit(basket1, basket2);
        System.out.println(ans);
    }
    public static long findit(int[] basket1, int[] basket2){
        Map<Integer, Integer> mp1 = new HashMap<>();
        Map<Integer, Integer> mp2 = new HashMap<>();
        List<Integer> lst = new ArrayList<>();
        long ans = 0;

        for(int i = 0; i<basket1.length; i++){
            mp1.put(basket1[i], mp1.getOrDefault(basket1[i], 0) +1);
            mp2.put(basket2[i], mp2.getOrDefault(basket2[i], 0) +1);
        }
        for(int j = 0; j<basket1.length; j++){
            int b1 = basket1[j];
            int b2 = basket2[j];
            int f1 = mp1.getOrDefault(b1,0);
            int f2 = mp2.getOrDefault(b1,0);
            if((f1+f2) %2 != 0){
                return -1;
            }
            int f11 = mp1.getOrDefault(b2,0);
            int f22 = mp2.getOrDefault(b2,0);
            if((f11+f22) %2 != 0){
                return -1;
            }
            if(f1 != f2){
                int d = Math.abs(f1-f2);
                int c = d/2;
                while(c>0){
                    lst.add(b1);
                    c--;
                }
            }
            if(f11 != f22){
                int d = Math.abs(f11 - f22);
                int c = d/2;
                while(c>0){
                    lst.add(b2);
                    c--;
                }
            }
            mp1.remove(b1);
            mp2.remove(b1);
            mp1.remove(b2);
            mp2.remove(b2);

        }
        Collections.sort(lst);
        int l = 0;
        int r = lst.size()-1;
        while(l<r){
            ans = ans + Math.min(lst.get(l), lst.get(r));
            l++;
            r--;
        }
        return ans;
    }
}
