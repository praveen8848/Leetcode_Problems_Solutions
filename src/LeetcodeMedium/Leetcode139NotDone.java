package LeetcodeMedium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Leetcode139NotDone {
    public static void main(String[] args) {
        String s = "aaaaaaa";
        List<String> wordDict= new ArrayList<>();
        wordDict.add("aaaa");
        wordDict.add("aaa");
//        wordDict.add("sand");
//        wordDict.add("and");
//        wordDict.add("cat");
        System.out.println(wordDict);
        boolean ans = checkit(s,wordDict);
        System.out.println(ans);
    }
    static boolean checkit(String s, List<String> wordDict){
        boolean ans = true;
        HashSet<String> st = new HashSet<>(wordDict);
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<s.length(); i++){
            sb.append(s.charAt(i));
            if(st.contains(sb.toString())){
                sb.delete(0,sb.length());
            }
        }
        if(!sb.isEmpty()){
            return false;
        }
        return ans;
    }
}
