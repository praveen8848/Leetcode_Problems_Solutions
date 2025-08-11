package LeetcodeMedium;

import java.util.*;

public class Leetcode49 {
    public static void main(String[] args) {
       String[] strs = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> ans = groupanagram(strs);
        System.out.println(ans);
    }

    private static List<List<String>> groupanagram(String[] strs) {
        List<List<String>> ans = new ArrayList<>();

        int[] arr = new int[strs.length];
        int k = 0;
        Map<String, List<String>> mp = new HashMap<>();
        List<String> maplist = new ArrayList<>();
        for (int i = 0; i < strs.length; i++) {
             char[] ch = strs[i].toCharArray();
            Arrays.sort(ch);
            String s = new String(ch);
            if(!mp.containsKey(s)){
                mp.put(s,new ArrayList<>());
            }
            mp.get(s).add(strs[i]);
        }
         return new ArrayList<>(mp.values());
    }
}
