package LeetcodeMedium;

import java.util.*;

public class Leetcode624 {
    public static void main(String[] args) {
        List<List<Integer>> arrays = new ArrayList<>();

        // Adding inner lists using Arrays.asList()
        arrays.add(Arrays.asList(1, 2, 3));
        arrays.add(Arrays.asList(4, 5));
        arrays.add(Arrays.asList(1, 2, 3));
        int ans = maxdistance(arrays);
        System.out.println(ans);
    }

    private static int maxdistance(List<List<Integer>> arrays) {
      int result = Integer.MIN_VALUE;
      int min = arrays.getFirst().getFirst();
      int max = arrays.getFirst().getLast();
        for (int i = 1; i < arrays.size(); i++) {
            result = Math.max(result, Math.abs(arrays.get(i).get(arrays.get(i).size()-1) - min));
            result = Math.max(result, Math.abs(arrays.get(i).get(0) - max));
            min = Math.min(min, arrays.get(i).get(0));
            max = Math.max(max,arrays.get(i).get(arrays.get(i).size()-1));
        }
        return result;
    }
}
