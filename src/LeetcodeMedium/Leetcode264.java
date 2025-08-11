package LeetcodeMedium;

public class Leetcode264 {
    public static void main(String[] args) {
        int n = 1352;
        int ans = nthUglynumber(n);
        System.out.println(ans);
    }

    private static int nthUglynumber(int n) {
        int count = 0;
        int a = 1;
        int ans = 1;
        while (count != n) {
            if (checkit(a)) {
                count++;
                if(count == n){
                    ans = a;
                }
            }
            a++;
        }
        return ans;
    }
    private static boolean checkit(int n) {
        if (n == 1) {
            return true;
        }
        boolean ans = true;
        if(n%2 != 0&& n%3 != 0 &&  n%5 != 0){
            return false;
        }
        return ans;
    }
}
