package Leetcode_Easy;

public class Leetcode258 {
    public static void main(String[] args) {
        int num = 38;
        int ans = addDigitss(num);
        System.out.println(ans);
    }
    static int addDigits(int num){
        int sum = 0;
        int p ;
        while(num>0){
            p = num%10;
            sum = sum +p;
            num = num/10;

            if(num == 0){
                if(sum<10){
                    return sum;
                }
                else{
                    num = sum;
                    sum = 0;
                }
            }
        }
        return 0;
    }
    static int addDigitss(int num){
       if(num == 0){
           return 0;
       }
       return 1 + (num-1)%9;
    }
}

