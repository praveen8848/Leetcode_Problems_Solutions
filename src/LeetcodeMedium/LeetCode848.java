package LeetcodeMedium;

public class LeetCode848 {
    public static void main(String[] args) {
        String s = "ktmq";
        int[] shifts = {26,9,17};
        System.out.println(function(s, shifts));
    }

    private static String function(String s, int[] shifts) {
        StringBuilder sb = new StringBuilder();

        long sum = 0;
        for(int n : shifts){
            sum += n;
        }
        long t = sum;
        int c = s.charAt(0)-'a';
        t = (t+c)%26;
        sb.append((char)((t+'a')));
        for(int i = 1;i<shifts.length; i++){
            sum -= shifts[i-1];
            t= sum;
            t = t%26;
            c = s.charAt(i)-'a';
            t = (t+c)%26;
            sb.append((char)((t+'a')));
        }
        return sb.toString();
    }
}
