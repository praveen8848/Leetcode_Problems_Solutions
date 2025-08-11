package LeetcodeMedium;

import java.util.ArrayList;

public class Leetocode907 {
    public static void main(String[] args) {
        int[] arr = {3,1,2,4};
        int ans = sumofSubarray(arr);
        System.out.println(ans);
    }

    private static int sumofSubarray(int[] arr) {
        int n = arr.length;
        int mod = 1000000007; //1000000007
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int min = arr[i];
            for (int j = i; j < n; j++) {
                min = Math.min(min,arr[j]);
                sum = min + sum%mod;
            }
        }
        return sum;














//        long sum = 0;
//        int min = Integer.MAX_VALUE;
//        ArrayList<Long> lst = new ArrayList<>();
//
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i; j < arr.length; j++) {
//                for (int k = i; k <= j ; k++) {
//                    if(arr[k]<min){
//                        min = arr[k];
//                    }
//                }
//                lst.add((long) min);
//                min = Integer.MAX_VALUE;
//            }
//        }
//
//        System.out.println(lst);
//
//        for (int i = 0; i < lst.size(); i++) {
//            sum = sum + (long)lst.get(i);
//        }
//        return (int)(sum%1000000007);
    }
}
