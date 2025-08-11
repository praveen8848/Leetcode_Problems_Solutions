package Leetcode_Easy;

public class Leetcode3304 {
    public static void main(String[] args) {
        int k = 5;
        char ans = findit(k);
        System.out.println(ans);
    }

    private static char findit(int k) {
        char[] ch = new char[k+1];
        ch[0] = 'a';
        int j = 1;
        while(j<k){
            int i = j;
            int m = 0;
            while(m<i && j<k){
                char c = ch[m];
                if(c == 'z'){
                    ch[j] = 'a';
                }
                else{
                    ch[j] = (char)(c+1);
                }
                j++;
                m++;
            }
        }
        return ch[k-1];
    }
}
