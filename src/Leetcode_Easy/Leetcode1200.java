package Leetcode_Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode1200 {
    public static void main(String[] args) {
        int[] arr = {-17,46,63,81,-101,-91,121,-2,112,-15,-65,-96,6,-139};
        System.out.println(findit(arr));
    }

    private static List<List<Integer>> findit(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        int mini = Integer.MAX_VALUE;
        for(int i = 1; i<arr.length; i++){
            int d = arr[i]-arr[i-1];
            List<Integer> lst = new ArrayList<>();
            lst.add(arr[i-1]);
            lst.add(arr[i]);
            if(d<mini){
                mini = d;
                while(!ans.isEmpty()){
                    ans.remove(ans.size()-1);
                }
                ans.add(new ArrayList(lst));
            }
            else if(d == mini){
                ans.add(new ArrayList<>(lst));
            }

        }
        return ans;
    }
}
