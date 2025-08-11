package LeetcodeMedium;


//You are given an array happiness of length n, and a positive integer k.
//There are n children standing in a queue, where the ith child has happiness value happiness[i]. You want to select k children from these n children in k turns.
// In each turn, when you select a child, the happiness value of all the children that have not been selected till now decreases by 1. Note that the happiness value cannot become negative and gets decremented only if it is positive.
//Return the maximum sum of the happiness values of the selected children you can achieve by selecting k children.

//https://leetcode.com/problems/maximize-happiness-of-selected-children/


import java.util.Arrays;

public class Leetcode3075 {
    public static void main(String[] args) {
     int[] nums = {3,2,1,6,4,5};

       int k = 3;
      long ans = maximumHappinessSum(nums,k);
        System.out.println(ans);
    }
    static long  maximumHappinessSum(int[] happiness, int k){
        Arrays.sort(happiness,k,happiness.length);
        System.out.println(Arrays.toString(happiness));
        long sum = 0;
        long m = 0, tempsum;
        while(k>0){
          tempsum =  happiness[(int) (happiness.length-1-m)]-m;
          if(tempsum>0){
              sum = sum+tempsum;
          }
          m = m+1;
          k = k-1;
        }
        return sum;
    }
}









