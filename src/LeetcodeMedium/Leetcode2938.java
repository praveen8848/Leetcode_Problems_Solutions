package LeetcodeMedium;

public class Leetcode2938 {
    public static void main(String[] args) {
        String s = "100";
        long ans = minimumswap(s);
        System.out.println(ans);
    }

    private static long minimumswap(String s) {
//       int countone = 0;
//       long ans = 0;
//        for (int i = 0; i < s.length(); i++) {
//            if(s.charAt(i) =='1'){
//                countone++;
//            }
//        }
//        for (int i = s.length()-1; i >=0 ; i--) {
//            if(s.charAt(i) == '0'){
//                ans = ans + countone;
//            }
//            else{
//                countone--;
//            }
//        }
//        return ans;
        long ans = 0, countone = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '1'){
                countone++;
            }
            else {
                ans = ans + countone;
            }
        }
        return ans;
    }
}
