package Leetcode_Easy;

import java.lang.reflect.Array;
import java.util.Arrays;

public class leetcode1455 {
    public static void main(String[] args) {
        String sentence = "i love eating burger";
        String searchWord = "burg";
        int ans = findit(sentence,searchWord);
        System.out.println(ans);
    }
    static int findit(String sentence, String searchWord){
        String[] s = sentence.split(" ");
        int ans = -1;
        for (int i = 0; i < s.length; i++) {
            if(s[i].length()>= searchWord.length()){
                String ss = s[i];
                int j = 0;
                while(j<searchWord.length()){
                    char ch = ss.charAt(j);
                    char ch2 = searchWord.charAt(j);
                    if(ch == ch2){
                        j++;
                    }
                    else{
                        break;
                    }
                }
                if(j == searchWord.length()){
                    ans = i + 1;
                    break;
                }
            }
        }
        return ans;
    }
}
