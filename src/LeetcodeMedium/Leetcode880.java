package LeetcodeMedium;

import java.util.Stack;

public class Leetcode880 {
    public static void main(String[] args) {
        String s =   "yyuele72uthzyoeut7oyku2yqmghy5luy9qguc28ukav7an6a2bvizhph35t86qicv4gyeo6av7gerovv5lnw47954bsv2xruaej";
        int k = 123365626;
        String ans = findit(s,k);
        System.out.println(ans);
    }

    private static String findit(String s, int k) {
      StringBuilder sb = new StringBuilder();
      int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                count = count*(ch-'0');
                int j = 0;
                while(j<(ch-'0')-1){
                    sb.append(sb.substring(0,sb.length()));
                    j++;
                }

            }
            else {
                count++;
                sb.append(ch);
            }
            if(k<=count){
                String ss = ""+sb.charAt(k-1);
                return ss;
            }

        }
        return "";
    }
}
