package Leetcode_Easy;

public class Leetcode1636 {
    public static void main(String[] args) {
        String s1 = "aa";
        String s2 = "ac";
        boolean ans  = findit(s1, s2);
        System.out.println(ans);
    }
    static boolean findit(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        int i = -1;
        int j = - 1;
        for(int k = 0; k<s1.length(); k++){
            if(s1.charAt(k) != (s2.charAt(k))){
                i = k;
                break;
            }
        }

        for(int m = s1.length()-1; m>=0; m--){
            if(s1.charAt(m) != (s2.charAt(m))){
                j = m;
                break;
            }
        }
        StringBuilder sb = new StringBuilder(s2);
        if(i != -1 || j != -1){
            char ch = s2.charAt(i);
            char ch2 = s2.charAt(j);
            sb.deleteCharAt(i);
            if(i != j){
                sb.deleteCharAt(j-1);
            }
            sb.insert(i,ch2);
            sb.insert(j,ch);
        }
        String ss = sb.toString();
        if(ss.equals(s1)){
            return  true;
        }
        return false;
    }
}
