package LeetcodeMedium;

public class Leetcode633 {
    public static void main(String[] args) {
        int c  = 2147483600;
        boolean ans = judjesquare(c);
        System.out.println(ans);
    }

    private static boolean judjesquare(int c) {
//        int j = (int)Math.sqrt(c);
//        int k = j;
//        int i = c-k*k;
//        i = (int)Math.sqrt(i);
//        for ( ; k>= j/2; k--) {
//            for (; i <= j; i++ ) {
//                if (i * i + k * k == c) {
//                    return true;
//                }
//                else if(i * i + k * k > c){
//                    break;
//                }
//            }
//        }
//        return false;

        long s = 0, e = (long) Math.sqrt(c);

        while (s <= e) {
            long sumOfSquares = s * s + e * e;
            if (sumOfSquares == c) {
                return true;
            } else if (sumOfSquares > c) {
                e--;
            } else {
                s++;
            }
        }

        return false;





    }

}
