package Leetcode_Easy;

public class Leetcode2678 {
    public static void main(String[] args) {
        String[] details = {"7868190130M7522","5303914400F9211","9273338290F4010"};
        int ans  = minage(details);
        System.out.println(ans);
    }

    private static int minage(String[] details) {
        int count = 0;
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for(int i = 0; i < details.length; i++){
            sb.append(details[i]);
            int x = 11;
            while( x < 13){
                sb2.append(sb.charAt(x));
                x++;
            }
            String str = sb2.toString();
            int num = Integer.parseInt(str);
            if(num>60){
                count++;
            }
            sb2.delete(0, sb.length());
            sb.delete(0, sb.length());
        }
        return count;
    }
}
