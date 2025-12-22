
package LeetcodeMedium;
import java.util.*;


class Leetcode2192 {
    public List<List<Integer>> getAncestors(int n, int[][] edges) {

        // Adjacency list
        List<Integer>[] adj = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            adj[i] = new ArrayList<>();
        }

        // In-degree array
        int[] indegree = new int[n];

        // Build graph
        for (int[] e : edges) {
            adj[e[0]].add(e[1]);
            indegree[e[1]]++;
        }

        // Ancestor sets
        List<Set<Integer>> ancestors = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ancestors.add(new HashSet<>());
        }

        // Kahn's Algorithm queue
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (indegree[i] == 0) {
                q.offer(i);
            }
        }

        // Topological processing
        while (!q.isEmpty()) {
            int u = q.poll();

            for (int v : adj[u]) {
                // Add u and all its ancestors to v
                ancestors.get(v).add(u);
                ancestors.get(v).addAll(ancestors.get(u));

                indegree[v]--;
                if (indegree[v] == 0) {
                    q.offer(v);
                }
            }
        }

        // Convert sets to sorted lists
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<Integer> list = new ArrayList<>(ancestors.get(i));
            Collections.sort(list);
            result.add(list);
        }

        return result;
    }
}
