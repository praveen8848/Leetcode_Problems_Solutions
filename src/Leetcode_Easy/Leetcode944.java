package Leetcode_Easy;

public class Leetcode944 {
    public static void main(String[] args) {
        String[] strs = {"rrjk","furt","guzm"};
        int ans = findit(strs);
        System.out.println(ans);
    }

    private static int findit(String[] strs) {
        int n = strs[0].length();
        int a = strs.length;
        int ans = 0;
        for(int i = 0; i<n; i++){
            char ch = strs[0].charAt(i);
            for(int j = 0; j<a; j++){
                char ch2 = strs[j].charAt(i);
                if(ch2<ch){
                    ans++;
                    break;
                }
                ch = ch2;
            }
        }
        return ans;
    }
}
