import java.util.ArrayList;
import java.util.List;

class Leetcode797 {
    public static void main(String[] args) {
        int[][] graph = {{1,2}, {3}, {3}, {}};
        System.out.println(allPathsSourceTarget(graph));
    }
    private static List<List<Integer>> ans;
    public static List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        int n = graph.length;
        List<Integer> lst = new ArrayList<>();
        lst.add(0);
        ans = new ArrayList<>();
        dfs(graph, 0, n, lst);
        return ans;
    }
    public static void dfs(int[][] graph, int s, int n, List<Integer> lst){
        if( s == n-1){
            ans.add(new ArrayList(lst));
            return;
        }
        for( int ne : graph[s]){

            lst.add(ne);
            dfs(graph, ne, n, lst);
            lst.remove(lst.size()-1);

        }
        return;
    }
}