package Leetcode_HARD;

import java.util.ArrayList;
import java.util.List;

public class Leetcode2197 {
    public static void main(String[] args) {
        int[] nums = {31,97561,97561,97561,97561,97561,97561,97561,97561};
        List<Integer> ans = find(nums);
        System.out.println(ans);
    }

    private static List<Integer> find(int[] nums) {
        List<Integer> lst = new ArrayList<>();
        for(int i = 0; i<nums.length; i++){
            int n = nums[i];
            while(!lst.isEmpty()){
                int top = lst.get(lst.size()-1);
                int gcd = findit(n, top);
                if(gcd>1){
                    lst.remove(lst.size()-1);
                    long lcm = (1L * n* top)/gcd;
                    n = (int)lcm;
                }
                else{
                    break;
                }
            }
            lst.add(n);
        }

        return lst;
    }
   static  int findit(int a, int b){
        while(b != 0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
}
