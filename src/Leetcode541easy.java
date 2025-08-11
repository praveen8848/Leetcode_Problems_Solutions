
// Easy
// https://leetcode.com/problems/reverse-string-ii/
// 541

import java.util.Arrays;

public class Leetcode541easy {
    public static void main(String[] args) {
        String s = "abcdefgh";
        int k = 3;
        System.out.println(s);
        System.out.println();
        String ans = reverseStr(s,k);
        System.out.println(ans);
    }
    static String reverseStr(String s, int k){
        char[] ch = s.toCharArray();
        int start = 0;
        int end = 0;
        if(ch.length<k){
            end = ch.length-1;
        }
        else{
            end = k-1;
        }
        while(start< ch.length && end<ch.length){
            swap(ch,start,end);
            start = start + 2*k;
            end = end + 2*k;
            if(end> ch.length-1){
                end = ch.length-1;
            }
        }
        String ans = new String(ch);
        return ans;
    }
    static void swap(char[] ch, int s, int e){
        while(s<e){
            char ig = ch[s];
            ch[s] = ch[e];
            ch[e] = ig;
            s++;
            e--;
        }
    }
}
