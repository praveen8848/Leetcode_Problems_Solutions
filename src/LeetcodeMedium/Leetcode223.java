package LeetcodeMedium;

public class Leetcode223 {
    public static void main(String[] args) {
        int ax1 = -2;
        int ay1 = -2;
        int ax2 = 2;
        int ay2 = 2;
        int bx1 = 3;
        int by1 = 3;
        int bx2 = 4;
        int by2 = 4;
        int a = findit(ax1, ay1, ax2, ay2, bx1, by1, bx2, by2);
        System.out.println(a);
    }

    private static int findit(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int ans = 0;
        int a1 = (ax2-ax1)*(ay2-ay1);
        int a2 = (bx2-bx1)*(by2-by1);
        ans = a1 + a2;
        int l = Math.min(ax2, bx2)-Math.max(bx1, ax1);
        int w = Math.min(ay2, by2)-Math.max(by1, ay1);
        int a3 = l*w;
        if(a3>0){
            ans -= a3;
        }
        return ans;
    }
}
