package LeetcodeMedium;

import java.util.*;

public class Leetcode2559 {
    public static void main(String[] args) {
        String[] words = {};
        int[][] queries  = {};
        int[] ans = f(words,queries);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] f(String[] words, int[][] queries) {
        int r = queries.length;
        int c = queries[0].length;
        int[] ans = new int[r];
        int[] psum = new int[words.length];
        int count = 0;
        HashSet<Character> st= new HashSet<>();
        st.add('a');
        st.add('e');
        st.add('i');
        st.add('o');
        st.add('u');
        for(int i = 0; i<words.length; i++){
            String s = words[i];
            if(st.contains(s.charAt(0)) && st.contains(s.charAt(s.length()-1))){
                count++;
            }
            psum[i] = count;
        }

        for(int i = 0; i<r; i++){
            int x = queries[i][0];
            int y = queries[i][1];
            int temp;
            if(x != 0){
                temp = psum[y] - psum[x-1];
            }
            else{
                temp = psum[y];
            }

            ans[i] = temp;
        }
        return ans;

    }
}
