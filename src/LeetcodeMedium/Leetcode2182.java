package LeetcodeMedium;

import java.util.Arrays;
import java.util.HashMap;

public class Leetcode2182 {
    public static void main(String[] args) {
        String s = "cczazcc";
        int repeatlimit = 3;
        String ans = findit(s,repeatlimit);
        System.out.println(ans);
    }
    static String findit(String s, int repeatLimit){
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        StringBuilder result = new StringBuilder();

        int freq = 1;
        int pointer = chars.length - 1;

        for (int i = chars.length - 1; i >= 0; --i) {
            if (result.length() > 0 && result.charAt(result.length() - 1) == chars[i]) {
                if (freq < repeatLimit) {
                    result.append(chars[i]);
                    freq++;
                } else {
                    while (pointer >= 0 && (chars[pointer] == chars[i] || pointer > i)) {
                        pointer--;
                    }

                    if (pointer >= 0) {
                        result.append(chars[pointer]);
                        char temp = chars[i];
                        chars[i] = chars[pointer];
                        chars[pointer] = temp;
                        freq = 1;
                    } else {
                        break;
                    }
                }
            } else {
                result.append(chars[i]);
                freq = 1;
            }
        }
        return result.toString();
    }
}
