package Leetcode_Easy;

public class Leetcode2429 {
    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 5;
        int ans = findit(num1, num2);
        System.out.println(ans);
    }
    public static int findit(int num1, int num2){
        int count = 0;
//        Countinng Set bits of num2
        while(num2>0){
            count = count + (num2 & 1);
            num2 = num2>>1;
        }
//        Finding the MSB of num1
        int msb = 0;
        int x = num1;
        while(x>1){
            x = x>>1;
            msb++;
        }
        x = 1<<msb;
//        Finding answer.
        int ans = 0;
        for (int i = msb; i >=0 && count>0; i--) {
            if((num1 & (1<<i)) != 0) {
              ans =  setbit(ans, i);
                count--;

            }
        }
        x = ans;
        while(ans>1){
            ans = ans>>1;
            msb++;
        }
        return ans;
    }
    public static int setbit(int ans, int pos){
        int mask = 1<<pos;
        int x  = (ans|mask);
        return x;
    }
}
