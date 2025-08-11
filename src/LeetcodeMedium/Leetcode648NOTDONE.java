package LeetcodeMedium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode648NOTDONE {
    public static void main(String[] args) {
        List<String> dictionary = new ArrayList<>(Arrays.asList("ac", "ab"));
        String sentence = "it is abnormal that this solution  a is accepted";
        String ans = replaceWords(dictionary, sentence);
        System.out.println(ans);
    }

    static String replaceWords(List<String> dictionary, String sentence) {
//        int count = 0;
//          String[] str = sentence.split(" ");
//          StringBuilder sb = new StringBuilder();
//          StringBuilder ans = new StringBuilder();
//          StringBuilder sbr = new StringBuilder();
//          for (int i = 0; i < str.length; i++) {
//              sb.append(str[i]);
//              for (int j = 0; j < dictionary.size(); j++) {
//                  sbr.append(dictionary.get(j));
//                  for (int k = 0; k < sbr.length(); k++) {
//                      if(sb.length()<sbr.length()){
//                          break;
//                      }
//                      if(sb.charAt(k) != sbr.charAt(k)){
//                          break;
//                      }
//                      else {
//                          count++;
//                      }
//                  }
//                  if(count != 0){
//                     sb.delete(0,sb.length());
//                     sb.append(sbr);
//                     count = 0;
//                     break;
//                  }
//                 sbr.delete(0,sbr.length());
//              }
//              sbr.delete(0,sbr.length());
//              ans.append(sb);
//              ans.append(" ");
//              sb.delete(0,sb.length());
//          }
//
//         return ans.toString().trim();
        int count = 0;
        String[] str = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        StringBuilder ans = new StringBuilder();
        StringBuilder sbr = new StringBuilder();

        for (int i = 0; i < str.length; i++) {
            sb.append(str[i]);
            boolean replaced = false;
            for (int j = 0; j < dictionary.size(); j++) {
                sbr.append(dictionary.get(j));
                int minLength = Math.min(sb.length(), sbr.length());

                // Check if the substring of sb matches sbr up to the length of sbr
                boolean match = true;
                for (int k = 0; k < minLength; k++) {
                    if (sb.charAt(k) != sbr.charAt(k)) {
                        match = false;
                        break;
                    }
                }

                // If there was a match, replace sb with sbr
                if (match && sb.length() >= sbr.length()) {
                    sb.delete(0, sb.length());
                    sb.append(sbr);
                    replaced = true;
                    break;
                }

                sbr.delete(0, sbr.length());
            }

            // If no replacement was done, append the original word
            ans.append(sb);
            ans.append(" ");

            // Clear StringBuilders for the next iteration
            sb.delete(0, sb.length());
            sbr.delete(0, sbr.length());
        }

        return ans.toString().trim();
    }
}
