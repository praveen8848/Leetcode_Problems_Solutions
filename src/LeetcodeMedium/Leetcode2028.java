package LeetcodeMedium;

import java.util.*;

public class Leetcode2028  {
    public static void main(String[] args) {
        int[] rolls = {4,2,2,5,4,5,4,5,3,3,6,1,2,4,2,1,6,5,4,2,3,4,2,3,3,5,4,1,4,4,5,3,6,1,5,2,3,3,6,1,6,4,1,3};
        int mean = 2;
        int n = 53;
        int[] ans = missingRolls(rolls,mean,n);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] missingRolls(int[] rolls, int mean, int n) {
        int[] ans = new int[n];
     int sum = 0;
     int  total = 0;
     for(int i = 0; i<rolls.length;i++){
         sum = sum + rolls[i];
     }
      total = n + rolls.length;
     int target  =  total*mean - sum;
     int a = target/n;
     int remainder =  target%n;
     if(a>6 || a<0 || target<n ||(a == 6 && remainder != 0)){
         return ans;
     }
     else {

         int j = 0;
         while(j<n){
             ans[j] = a;
             if(remainder>0){
                 ans[j] = a+1;
                 remainder--;
             }
             j++;
         }

     }
        System.out.println(ans.length);
     return ans;
    }
}
