package Leetcode_Easy;

public class Leetcode1876 {
    public static void main(String[] args) {
        String s = "aababcabc";
        int ans = goodstring(s);
        System.out.println(ans);
    }

    private static int goodstring(String s) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int j = 0;
        int count = 0;
        while(i<s.length()){
            sb.append(s.charAt(i));
            if(i - j + 1 < 3){
                i++;
            }
            else if(i - j + 1 == 3){
               if(checkitgood(sb)){
                   count++;
               }
               sb.deleteCharAt(0);
               j++;
               i++;
            }
        }
      return count;
    }

    private static boolean checkitgood(StringBuilder sb) {
        int[] nums = new int[26];
        for (int i = 0; i < sb.length(); i++) {
            nums[sb.charAt(i) - 'a']++;
            if(nums[sb.charAt(i) - 'a']>1){
                return false;
            }
        }
        return true;
    }
}
