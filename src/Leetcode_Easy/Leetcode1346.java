package Leetcode_Easy;

import java.util.HashSet;

public class Leetcode1346 {
    public static void main(String[] args) {

        int[] arr = {7,1,14,11};
        boolean ans = checkit(arr);
        System.out.println(ans);
    }
    static boolean checkit(int[] arr){
        HashSet<Integer> st = new HashSet<>();
        for(int i = 0; i<arr.length; i++){
            int x = arr[i]/2;
            if(arr[i]%2 != 0){
                x = Integer.MAX_VALUE;
            }
            int y = arr[i]*2;
            if(st.contains(x) || st.contains(y)){
                return true;
            }
            else{
                st.add(arr[i]);
            }
        }
        return false;
    }
}
