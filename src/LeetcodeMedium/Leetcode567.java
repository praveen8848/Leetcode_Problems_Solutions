package LeetcodeMedium;

import java.util.HashMap;
import java.util.*;

public class Leetcode567 {
    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidboaoo";
        boolean ans = checkit(s1, s2);
        System.out.println(ans);
    }
    static boolean checkit(String s1, String s2){
       char[] ch = s1.toCharArray();
       Arrays.sort(ch);
       String ss = new String(ch);

       for(int i = 0; i<s2.length()-s1.length(); i++){
           String s = s2.substring(i,i+s1.length());
           char[] ch2 = s.toCharArray();
           Arrays.sort(ch2);
           String sss = new String(ch2);
           if(ss.equals(sss)){
               return true;
           }
       }
       return false;
    }
}
