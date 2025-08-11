package LeetcodeMedium;

import java.util.*;
public class Lertcode648 {
    public static void main(String[] args) {
        List<String> dictionary =  Arrays.asList("cat","bat","rat");
        String sentence =  "the cattle was rattled by the battery";
        String ans = replacewords(dictionary,sentence);
        System.out.println(ans);
    }

    private static String replacewords(List<String> dictionary, String sentence) {
        Map<String,Integer> mp = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        StringBuilder ss = new StringBuilder();
        StringBuilder ans = new StringBuilder();
        boolean checkit = true;
        String[] words =  sentence.split(" ");

        for (int i = 0; i < dictionary.size(); i++) {
            mp.put( dictionary.get(i),1);
        }
        for (int i = 0; i < words.length; i++) {
           ss.append(words[i]);
          int k = 0;
          while(k<ss.length()){
              sb.append(ss.charAt(k));
              if(mp.containsKey(sb.toString())){
                  ans.append(sb).append(" ");
                  checkit = false;
                  break;
              }
              k++;
          }
          if(checkit) {
              if (sb.length() == ss.length()) {
                  ans.append(sb).append(" ");
              }
          }
          checkit  = true;
          ss.delete(0,ss.length());
          sb.delete(0, sb.length());
        }
        return ans.toString().trim();
    }
}
