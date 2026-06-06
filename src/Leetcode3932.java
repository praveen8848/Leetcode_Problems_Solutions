public class Leetcode3932 {
    public static void main(String[] args) {
        int l = 16;
        int r = 16;
        int k = 4;
        int ans = findit(l, r, k);
        System.out.println(ans);
    }

    private static int findit(int l, int r, int k) {
        // FIX 1: Use long to prevent integer overflow when r is Integer.MAX_VALUE
        long low = 1;
        long high = (long) r + 1;
        long upper = 0;

        // First binary search: find max root for 'r'
        while (low <= high) {
            long m = low + (high - low) / 2;
            if (calculate(m, k, r)) {
                upper = m;
                low = m + 1;
            } else {
                high = m - 1;
            }
        }

        long s = 1;
        long e = (long) l + 1;
        long lower = 0;

        // Second binary search: find max root for 'l - 1'
        while (s <= e) {
            long m = s + (e - s) / 2;
            if (calculate(m, k, l - 1)) {
                lower = m;
                s = m + 1;
            } else {
                e = m - 1;
            }
        }

        int ans = (int) (upper - lower);

        // we manually add 1 to the answer only if 0 is in the range.
        if (l <= 0 && r >= 0) {
            ans++;
        }

        return ans;
    }
    public static boolean calculate(long m, int k, long target){
        if (target < 0) return false;

        long a = 1;
        for (int i = 0; i < k; i++) {
            if (a > target / m) {
                return false;
            }
            a = a * m;
        }
        return true;
    }
}
