package Leetcode_Easy;

public class Leetcode263 {
    public static void main(String[] args) {
        int n = 1;
        boolean ans = checkit(n);
        System.out.println(ans);
    }

    private static boolean checkit(int n) {
        if (n == 1) {
            return true;
        }

        boolean ans = true;
        while (n % 2 == 0) {
            if (n == 2) break;
            n = n / 2;
        }
        while (n % 3 == 0) {

            if (n == 3) {
                break;
            }
            n = n / 3;
        }
        while (n % 5 == 0) {
            if (n == 5) {
                break;
            }
            n = n / 5;
        }
        if (n != 2 && n != 3 && n != 5) {
            return false;
        }
        return ans;
    }
}
