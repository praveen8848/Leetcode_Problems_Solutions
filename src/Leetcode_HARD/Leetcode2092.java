package Leetcode_HARD;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class Leetcode2092 {
    public static void main(String[] args) {
        int n = 6;
        int[][] meetings = {{1,2,5}, {2,3,8}, {1,5,10}};
        int firstPerson = 1;
        List<Integer> ans = new ArrayList<>();
        ans = findAllPeople(n, meetings, firstPerson);
        System.out.println(ans);
    }
    public static List<Integer> findAllPeople(int n, int[][] meetings, int firstPerson){
        List<List<Pair>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        // Build bidirectional graph
        for (int[] p : meetings) {
            adj.get(p[0]).add(new Pair(p[1], p[2]));
            adj.get(p[1]).add(new Pair(p[0], p[2]));
        }

        int[] time = new int[n];
        Arrays.fill(time, Integer.MAX_VALUE);
        time[0] = 0;
        time[firstPerson] = 0;

        PriorityQueue<Pair> pq = new PriorityQueue<>(
                (a, b) -> Integer.compare(a.w, b.w)
        );

        pq.add(new Pair(0, 0));
        pq.add(new Pair(firstPerson, 0));

        while (!pq.isEmpty()) {
            Pair p = pq.poll();
            int v = p.v;
            int t = p.w;

            if (t > time[v]) continue;

            for (Pair nei : adj.get(v)) {
                if (nei.w >= t && nei.w < time[nei.v]) {
                    time[nei.v] = nei.w;
                    pq.add(new Pair(nei.v, nei.w));
                }
            }
        }

        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (time[i] != Integer.MAX_VALUE) {
                ans.add(i);
            }
        }

        return ans;
    }
}
class Pair {
    int v;
    int w;
    Pair(int v, int w) {
        this.v = v;
        this.w = w;
    }
}