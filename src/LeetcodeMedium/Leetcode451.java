package LeetcodeMedium;

import java.util.*;
public class Leetcode451 {
    public static void main(String[] args) {
        String s = "tree";
        String ans = sortbyfrequency(s);
        System.out.println(ans);
    }

    private static String sortbyfrequency(String s) {
        StringBuilder sb = new StringBuilder();
        Map<Character, Integer> mp = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(mp.isEmpty()){
                mp.put(ch,1);
            }
            else if(mp.containsKey(ch)){
                mp.put(ch, mp.get(ch) + 1);
            }
            else {
                mp.put(ch, 1);
            }
        }
        List<Map.Entry< Character, Integer>> list = new ArrayList<>(mp.entrySet());
        list.sort(Map.Entry.comparingByValue());
        Collections.reverse(list);
        for (Map.Entry<Character, Integer> entry : list) {
            int a = entry.getValue();
            char c = entry.getKey();
            while(a>0){
                sb.append(c);
                a--;
            }
        }

     return sb.toString();
    }
}
