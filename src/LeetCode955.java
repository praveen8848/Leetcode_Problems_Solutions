public class LeetCode955 {
    public static void main(String[] args) {
        String[] strs = {"xga","xfb","yfa"};
        int ans = findit(strs);
        System.out.println(ans);
    }

    private static int findit(String[] strs) {
        int ans = 0;
        int n = strs.length;
        int ss = strs[0].length();

        boolean[] fixed = new boolean[n - 1];

        for (int i = 0; i < ss; i++) {
            boolean delete = false;

            for (int j = 0; j < n - 1; j++) {
                if (!fixed[j] && strs[j].charAt(i) > strs[j + 1].charAt(i)) {
                    delete = true;
                    break;
                }
            }

            if (delete) {
                ans++;
                continue;
            }

            for (int j = 0; j < n - 1; j++) {
                if (!fixed[j] && strs[j].charAt(i) < strs[j + 1].charAt(i)) {
                    fixed[j] = true;
                }
            }
        }

        return ans;
    }
}
