package LeetcodeMedium;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

public class Leetcode3160 {
    public static void main(String[] args) {
        int[][] queries = {{0,1},{1,4},{1,1},{1,4},{1,1}};
        int limit = 1;
        int[] ans = f(queries, limit);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] f(int[][] queries, int limit) {
        int n = queries.length;
        int[] ans = new int[n];

        HashMap<Integer, Integer> ball = new HashMap<>();
        HashMap<Integer, Integer> color = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int ballId = queries[i][0];
            int newColor = queries[i][1];

            if (ball.containsKey(ballId)) {
                int oldColor = ball.get(ballId);

                color.put(oldColor, color.get(oldColor) - 1);
                if (color.get(oldColor) == 0) {
                    color.remove(oldColor);
                }
            }

            ball.put(ballId, newColor);
            color.put(newColor, color.getOrDefault(newColor, 0) + 1);
            ans[i] = color.size();
        }
        return ans;
    }
}
