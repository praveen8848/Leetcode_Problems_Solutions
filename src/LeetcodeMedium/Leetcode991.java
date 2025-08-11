package LeetcodeMedium;


//There is a broken calculator that has the integer startValue on its display initially. In one operation, you can:
//multiply the number on display by 2, or
//subtract 1 from the number on display.
//Given two integers startValue and target, return the minimum number of operations needed to display target on the calculator.



public class Leetcode991 {
    public static void main(String[] args) {
        int s = 3;
        int t = 10;
        int ans = brokencalculator(s,t);
        System.out.println(ans);
    }
   static int brokencalculator(int startvalue, int target){
        int count = 0;
        int ans = 0;
        while (target != startvalue){
        if(target<startvalue){
            target = target+1;
            count++;
        }
         else if (target > startvalue) {
            if (target % 2 != 0) {
                target = target + 1;
                count++;
            } else {
                target = target / 2;
                count++;
            }
         }
        }
       return count;
   }
}
