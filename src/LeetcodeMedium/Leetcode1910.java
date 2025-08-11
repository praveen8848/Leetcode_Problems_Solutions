package LeetcodeMedium;

public class Leetcode1910 {
    public static void main(String[] args) {
        String s = "daabcbaabcbc";
        String part = "abc";
        String ans = findit(s, part);
        System.out.println(ans);
    }
    static String findit(String s, String part){
        StringBuilder sb = new StringBuilder();
        int k = part.length();
        int l = s.length();

        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            sb.append(ch);
            if(sb.length()>= k && sb.substring(sb.length()-k).equals(part)){
                sb.delete(sb.length()-k, sb.length());
            }
        }
        return sb.toString();
    }
}
