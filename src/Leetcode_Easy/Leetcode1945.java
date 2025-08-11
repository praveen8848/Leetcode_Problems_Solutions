package Leetcode_Easy;


//You are given a string s consisting of lowercase English letters, and an integer k.
//
//First, convert s into an integer by replacing each letter with its position in the alphabet
//        (i.e., replace 'a' with 1, 'b' with 2, ..., 'z' with 26). Then,
//transform the integer by replacing it with the sum of its digits. Repeat the transform operation k times in total.


public class Leetcode1945 {
    public static void main(String[] args) {
       String s = "iiii";
       int k = 1;
       int ans = getLucky(s,k);
        System.out.println(ans);
    }

    private static int getLucky(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(i)-96);
        }
        while(k != 0){
            for (int i = 0; i < sb.length(); i++) {
                sum = sum + sb.charAt(i)-'0';
            }
            sb.delete(0,sb.length());
            sb.append(sum);
            k--;
        }
        int a = Integer.parseInt(sb.toString());
        return a;

    }







































//    static int getLucky(String s, int k){
//        int sum = 0;
//        StringBuilder ans = new StringBuilder();
//        for (int i = 0; i < s.length(); i++) {
//            char ch = s.charAt(i);
//            ans.append((int)(ch)-96);
//        }
//        while(k>0){
//            for (int j = 0; j < ans.length(); j++) {
//                char ch = ans.charAt(j);
//                sum = sum + ch-'0';
//            }
//            ans.delete(0,ans.length());
//            ans.append(sum);
//            sum = 0;
//            k--;
//        }
//        String str  = ans.toString();
//        return Integer.parseInt(str);
//    }
}
