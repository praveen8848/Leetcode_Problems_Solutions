package Leetcode_Easy;

public class Leetcode202 {
    public static void main(String[] args) {
        int n = 2346571;
        boolean ans = isHappy(n);
        System.out.println(ans);
    }
    static boolean isHappy(int n){
        int ans = 0;
        while(n>0){
            String as = "" + n;
            for (int i = 0; i < as.length(); i++) {
                char numdigit = as.charAt(i);
              int digit = Character.getNumericValue(numdigit);
              ans =  digitsquaresum(digit,ans);
            }
            if(ans == 1){
                return true;
            }
            else if( ans == 2 || ans == 3 || ans == 4 || ans == 5 || ans == 6 || ans == 8 || ans == 9){
                return false;
            }
            else{
                n = ans;
                ans = 0;
            }
        }
        return false;
    }
    static int digitsquaresum(int pawan,int bhavesh){
         bhavesh = bhavesh + pawan*pawan;
        return bhavesh;
    }
}
