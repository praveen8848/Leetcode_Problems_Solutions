package LeetcodeMedium;

public class Leetocde650 {
    public static void main(String[] args) {
        int n = 124;
        int ans = minSteps(n);
        System.out.println(ans);
    }

    private static int minSteps(int n) {
        int count = 0;
        for (int i = 2; i <= n ; i++) {
            while(n%i == 0){
                count = count + i;
                n = n/i;
            }
        }
        return count;
    }
}
