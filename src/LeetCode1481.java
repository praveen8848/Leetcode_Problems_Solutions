import java.util.Arrays;
import java.util.HashMap;

public class LeetCode1481 {
    public static void main(String[] args) {
        int[] arr = {4,1,1,3,3,3,2};
        int k = 3;
        int ans = findit(arr, k);
        System.out.println(ans);
    }
    public static int findit(int[] arr, int k){
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int n : arr){
            mp.put(n, mp.getOrDefault(n,0)+1);
        }
        int s = mp.size();
        int[] ans = new int[s];
        int i = 0;
        for(var e : mp.entrySet()){
            ans[i] = e.getValue();
            i++;
        }
        Arrays.sort(ans);
        int j = 0;
        for( j = 0; j<ans.length; j++){
            int t = ans[j];
            if(t>k){
                break;
            }
            else{
                k = k-t;
            }
        }
        return ans.length-j;
    }
}
