package Leetcode_Easy;

public class ToffeeProblem {
    public static void main(String[] args) {
        int r = 5;
        int ans = findit(r);
        System.out.println(ans);
    }
    public static int findit(int r){
//        One Rupee buys three toffee.
//        We have to return the number of toffee we can buy from r rupee.
//        Three wrapper of toffee can buy one toffee.
        int ans = r*3;
        int t = ans;
        while (t > 2){
          int remainder = t%3;
          t = t/3;
          ans = ans + t;
          t = t + remainder;

        }
        return ans;
    }
}
