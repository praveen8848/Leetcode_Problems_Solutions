package Leetcode_Easy;


//You are given a string s.
//The score of a string is defined as the sum of the absolute difference
//between the ASCII values of adjacent characters.
//Return the score of s.
public class Leetcode3110 {
    public static void main(String[] args) {
        String s = "hello";
        int ans = scoreofString(s);
        System.out.println(ans);
        int ans2 = recursionapproach(s,0);
        System.out.println(ans2);

    }
    static int scoreofString(String s){
        int sum = 0;
        for (int i = 0; i < s.length()-1; i++) {
            int ans1 = s.charAt(i);
            int ans2 = s.charAt(i+1);
            sum = sum + Math.abs(ans1-ans2);
        }
        return sum;
    }
    static int recursionapproach(String s, int n){
        if(n == s.length()-1){
            return 0;
        }
        return Math.abs(s.charAt(n) - s.charAt(n+1)) + recursionapproach(s,n+1);
    }
}
