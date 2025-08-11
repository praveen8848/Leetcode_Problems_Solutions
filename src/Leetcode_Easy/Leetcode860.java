package Leetcode_Easy;

public class Leetcode860 {
    public static void main(String[] args) {
        int[] bills = {5,5,10,20,5,5,5,5,5,5,5,5,5,10,5,5,20,5,20,5};
        boolean ans = checkit(bills);
        System.out.println(ans);
    }

    private static boolean checkit(int[] bills) {
        boolean ans = true;
        int count10 = 0;
        int  count5 = 0;
        for (int i = 0; i < bills.length; i++) {
            if(bills[i] <=5){
                 count5++;
            }
            else if(bills[i] == 10){
                 count5--;
                count10++;
            }
            else {
                if(count10 ==0){
                    count5 = count5-3;
                }
                else{
                    count5--;
                    count10--;
                }
            }
            if( count5<0){
                return false;
            }
            if(count10<0){
                return false;
            }
        }
        return ans;
    }
}
