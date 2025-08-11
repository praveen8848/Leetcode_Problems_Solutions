package LeetcodeMedium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// solved with the help of GPT.

public class Leetcode216 {
    public static void main(String[] args) {
        int n = 9;
        int k = 3;
        List<List<Integer>> ans = combinationSum3(n,k);
        System.out.println(ans);
    }
    static List<List<Integer>> combinationSum3(int n, int k){
        List<List<Integer>> ans = new ArrayList<>();
        findcombinationsum(n,k,1,ans,new ArrayList<>());
        return ans;
    }

     static void findcombinationsum(int n, int k, int i, List<List<Integer>> ans, List<Integer> object) {
        if(k == 0){
            if(n == 0){
                ans.add(new ArrayList<>(object));
                return;
            }
            return;
        }
         for (int j = i; j <=9 && j<=n; j++) {
             object.add(j);
             findcombinationsum(n-j,k-1,j+1,ans,object);
             object.remove(object.size()-1);
         }
    }
}
