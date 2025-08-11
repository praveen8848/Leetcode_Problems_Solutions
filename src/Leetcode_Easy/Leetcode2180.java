package Leetcode_Easy;


//Given a positive integer num,
//        return the number of positive integers less than or equal to num whose digit sums are even.
//
//The digit sum of a positive integer is the sum of all its digits.





public class Leetcode2180 {
    public static void main(String[] args) {
        int num = 30;
        int ans = countEven(num);
        System.out.println(ans);
    }
    static int countEven(int num){
        int sum = 0;
        int k = 0;
        StringBuilder sb = new StringBuilder();
        while(num>0){
            if(num<10){
                if(num%2 == 0){
                    k++;
                }
            }
            else{
                sb.append(num);
                for (int i = 0; i < sb.length(); i++) {
                    char ch = sb.charAt(i);
                    sum = sum + ch-'0';
                }
                if(sum%2 == 0){
                    k++;
                }
                sum = 0;
                sb.delete(0,sb.length());
            }
            num--;
        }
        return k;
    }
}
