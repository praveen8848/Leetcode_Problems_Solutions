package Leetcode_Easy;

public class Leetcode2269 {
    public static void main(String[] args) {
       int num = 430043;
       int k = 2;
       int ans = findit(num,k);
        System.out.println(ans);
    }

    private static int findit(int num, int k) {
        String s = new String(String.valueOf(num));
        StringBuilder sb = new StringBuilder();
        int count = 0;
        int i = 0;
        int j = 0;
        while (i<s.length()){
           sb.append(s.charAt(i));
            if(i-j+1 <k){
                i++;
            }
            else if (i-j+1 == k) {
                int x = Integer.parseInt(sb.toString());
                if(x != 0){
                    if(num%x == 0){
                        count++;
                    }
                }
                sb.deleteCharAt(0);
                j++;
                i++;
            }
        }
        return count;
    }
}
