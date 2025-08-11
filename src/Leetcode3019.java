public class Leetcode3019 {
    public static void main(String[] args) {
        String s = "AaAaAaaA";
        int ans =  countKeyChanges(s);
        System.out.println(ans);
    }
    static int countKeyChanges(String s){
        int min = Integer.MIN_VALUE;
        int count = 0;
        int index = 1;
        while(index<s.length()) {
            for (int i = 0; i < s.length() - 1; i++) {
                int ans = (int) (s.charAt(i));
                int ans2 = (int) (s.charAt(index));
                if (ans != ans2 && (Math.abs(ans - ans2) != 32)) {
                    count++;
                    index++;
                }
                else {
                    index++;
                }
            }
        }
        return count;
    }
}
