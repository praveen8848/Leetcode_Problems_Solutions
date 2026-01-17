package LeetcodeMedium;

import java.util.Arrays;
import java.util.HashSet;

public class Leetcode2975 {
    public static void main(String[] args) {
        int m = 7;
        int n = 4;
        int[] hFences = {2,3,6,5};
        int[] vFences = {3,2};
        int ans = findit(m, n, hFences, vFences);
        System.out.println(ans);
    }

    private static int findit(int m, int n, int[] hFences, int[] vFences) {
        long ans = 0;
        int mod = 1000000007;
        HashSet<Integer> h = new HashSet<>();
        Arrays.sort(hFences);
        Arrays.sort(vFences);

        for (int i = 0; i < hFences.length; i++) {
            int d = hFences[i] - 1;
            h.add(d);

        }
        for (int i = 0; i < hFences.length; i++) {
            for (int j = i + 1; j < hFences.length; j++) {
                int d = hFences[j] - hFences[i];
                h.add(d);
            }
        }
        for (int i = 0; i < hFences.length; i++) {
            int d = m - hFences[i];
            h.add(d);

        }
        h.add(m - 1);
        for (int j = 0; j < vFences.length; j++) {
            int v = vFences[j] - 1;
            if (h.contains(v)) {
                long area = (long)v *v;
                ans = Math.max(ans, area);
            }
        }
        for (int j = 0; j < vFences.length; j++) {
            int v = n - vFences[j];
            if (h.contains(v)) {
                long area = (long)v * v;
                ans = Math.max(ans, area);
            }
        }
        for (int i = 0; i < vFences.length; i++) {
            for (int j = i + 1; j < vFences.length; j++) {
                int v = vFences[j] - vFences[i];
                if (h.contains(v)) {
                    long area = (long) v *v;
                    ans = Math.max(ans, area);
                }
            }
        }
        if (h.contains(n - 1)) {
            long a = (long) (n - 1)* (n - 1);
            ans = Math.max(ans, a);
        }
        return ans == 0 ? -1 :(int) (ans % mod);
    }
}
