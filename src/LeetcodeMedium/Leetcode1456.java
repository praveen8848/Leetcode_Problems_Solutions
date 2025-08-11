package LeetcodeMedium;

public class Leetcode1456 {
    public static void main(String[] args) {
        String s = "leetcode";
        int k = 2;
        int ans = checkit(s,k);
        System.out.println(ans);
    }

    private static int checkit(String s, int k) {
        int max = Integer.MIN_VALUE;
        int count = 0;
        StringBuilder sb = new StringBuilder();
        int i= 0,j = 0;
        while(i<s.length()){
            sb.append(s.charAt(i));
            if(s.charAt(i) == 'a'||s.charAt(i) == 'e'||s.charAt(i) == 'i'||s.charAt(i) == 'o'||s.charAt(i) == 'u'){
                count++;
            }
            if(i-j+1 <k){
                i++;
            }
            else if(i-j+1 == k){
                if(count>max){
                    max = count;
                }
                if(sb.charAt(0) == 'a'||sb.charAt(0) == 'e'||sb.charAt(0) == 'i'||sb.charAt(0) == 'o'||sb.charAt(0) == 'u'){
                    count--;
                }
                sb.deleteCharAt(0);
                j++;
                i++;
            }
        }
        return  max;
    }
}
