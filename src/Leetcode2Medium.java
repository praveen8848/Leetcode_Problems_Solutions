public class Leetcode2Medium {
    public static void main(String[] args) {
        System.out.println("We have to reverse an Integer.");
        int num = 234;
        System.out.println(num);
        reverse(num);


    }
    static int reverse(int x){
        int a = 0;

        while(x>0){
            int r = x%10;
            a = 10*a + r;
            x = x/10;
        }
        return a;
    }
}
