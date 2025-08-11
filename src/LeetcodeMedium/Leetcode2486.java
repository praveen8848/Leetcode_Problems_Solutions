package LeetcodeMedium;

public class Leetcode2486 {
    public static void main(String[] args) {
        String s = "z";
        String t = "abcde";
        int ans = appendCharacters(s,t);
        System.out.println(ans);
    }
    static int appendCharacters(String s, String t){
        int x = 0, y = 0;
        char[] ch1 = s.toCharArray();
        char[] ch2 = t.toCharArray();
         while(x<ch1.length && y<ch2.length){
             if(ch1[x] == ch2[y]){
                 x++;
                 y++;
             }
             else{
                 x++;
             }
         }
       return ch2.length-y;
    }
}
