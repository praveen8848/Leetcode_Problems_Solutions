package Leetcode_Easy;

public class Leetcode1518 {
    public static void main(String[] args) {
        int numBottles = 3;
        int numExchange = 10;
        int ans  = exchanging(numBottles, numExchange);
        System.out.println(ans);
    }

    private static int exchanging(int numBottles, int numExchange) {
        int ans = numBottles;
        int fullbottles = numBottles/numExchange;
        ans = ans + fullbottles;
        int remaining = numBottles - fullbottles*numExchange;
        int extras = fullbottles + remaining;
        if(extras > numExchange){
          int ans2 = helperfunction(ans, extras, numBottles, numExchange);
          return ans2;
        }
        else if (extras == numExchange){
            ans = ans + extras/numExchange;
        }
        return ans;
    }

    private static int helperfunction(int ans, int extras, int numBottles, int numExchange) {
        if(extras < numExchange){
            return ans;
        }
        numBottles = extras;
        int fullBottles = numBottles/numExchange;
        extras  =  numBottles - fullBottles*numExchange  + fullBottles;
        return  helperfunction(ans + fullBottles,extras,numBottles,numExchange);
    }
}
