package LeetcodeMedium;

import java.util.ArrayList;
import java.util.List;

public class Leetcode1823 {
    public static void main(String[] args) {
        int n = 6;
        int k = 5;
        int ans = winneringame(n, k);
        System.out.println(ans);
    }

    private static int winneringame(int n, int k) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }
        int m = k-1;
        return  helperfunction(list,k-1,m);
    }

    private static int helperfunction(List<Integer> list, int k,int m) {

        if(list.size()<2){
            return list.get(0);
        }
        if (k != 0){
            list.addLast(list.get(0));
            list.removeFirst();
            return helperfunction(list,k-1, m);
        }
        else {
            list.removeFirst();
            return helperfunction(list,k+m,m);
        }
    }
}
