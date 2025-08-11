package Leetcode_Easy;

public class Leetcode3099 {
    public static void main(String[] args) {
        int num = 18;
        int ans = sumofdigits(num);
        System.out.println(ans);
    }

    private static int sumofdigits(int x) {
        StringBuilder sb  = new StringBuilder();
        sb.append(x);
        int sum = 0;
        for (int i = 0; i < sb.length(); i++) {
            sum = sum + (sb.charAt(i)-'0');
        }
        if(x%sum == 0){
            return sum;
        }
        return -1;
    }
}
