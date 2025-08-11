package LeetcodeMedium;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Leetcode1894 {
    public static void main(String[] args) {
        int[] chalk = {3,4,1,2};
        int k = 25;
        int ans  = finndit(chalk, k);
        System.out.println(ans);
    }

    private static int finndit(int[] chalk, int k) {
//        int i = 0;
//        while(i<chalk.length){
//            if(k<chalk[i]){
//                return i;
//            }
//            else {
//                k = k - chalk[i];
//            }
//            i++;
//            if(i == chalk.length){
//                i = 0;
//            }
//        }
//        return 0;
        long sum = 0;
        for (int i = 0; i < chalk.length; i++) {
            sum = sum + chalk[i];
            if(sum>k){
                break;
            }
        }

        k = k%(int)sum;
        for (int i = 0; i < chalk.length; i++) {
            if(k<chalk[i]){
                return i;
            }
            k = k - chalk[i];
        }
        return 0;
    }
}
