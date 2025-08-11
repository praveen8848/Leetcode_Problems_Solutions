package LeetcodeMedium;

import java.util.HashMap;
import java.util.HashSet;

public class Leetcode2461 {
    public static void main(String[] args) {
        int[] nums = {9,18,10,13,17,9,19,2,1,18};
        int k = 5;
        long ans = findit(nums,k);
        System.out.println(ans);
    }
    static long findit(int[] nums, int k){
////      Using hashMap to store frequency while traversing over the array.
//        HashMap<Integer, Integer> mp = new HashMap<>();
//
//        boolean flag = true;
//
//
//        int i = 0;
//        int j = 0;
//        long ans = Long.MIN_VALUE;
//        long sum = 0;
//        boolean flag2 = true;
//
////        Here I am going to use use Sliding Window.
//
//        while (i < nums.length) {
//            sum = sum + nums[i];
//
////            Store the frequency of the current number.
//            mp.put(nums[i], mp.getOrDefault(nums[i], 0) + 1);
//
////            This is the core of this sol with the added condition in the if statement we will know
////            which number is repeated in the solution window and it raises false flag.
//            if (mp.containsKey(nums[i]) && mp.get(nums[i]) > 1) {
//                flag = false;
//            }
//            if (i - j + 1 < k) {
//                i++;
//            }
//
////            when window size is met and flag is true,
////            this block of code will compute the answer and other necessary steps.
//            else if (i - j + 1 >= k && flag) {
//                ans = Math.max(sum, ans);
//                sum = sum - nums[j];
//                mp.put(nums[j], mp.getOrDefault(nums[j], 0) - 1);
//                j++;
//                i++;
//
//            }
//
////            When flag is false means there  is repetition in the window,
////            so by using another flag2 to check the repetition in the next window.
////            if there is repetition initial flag will remain false otherwise will be marked true.
//            else {
//                mp.put(nums[j], mp.getOrDefault(nums[j], 0) - 1);
//                sum = sum - nums[j];
//                for (var e : mp.entrySet()) {
//                    if (e.getValue() >= 2) {
//                        flag2 = false;
//                        break;
//                    }
//                }
//                if (flag2) {
//                    flag = true;
//                }
//                flag2 = true;
//                i++;
//                j++;
//            }
//        }
//        return ans == Long.MIN_VALUE ? 0 : ans;

        HashSet<Integer> st = new HashSet<>();
        int i = 0, j = 0;
        long ans = Long.MIN_VALUE;
        long sum = 0;

        while(i<nums.length){

            while(j<i && st.contains(nums[i])){
                st.remove(nums[j]);
                sum  = sum - nums[j];
                j++;
            }
            st.add(nums[i]);
            sum = sum + nums[i];

            if( i -j +1 == k){
                ans = Math.max(sum, ans);
                sum = sum - nums[j];
                st.remove(nums[j]);
                j++;
            }
            i++;
        }
        return ans == Long.MIN_VALUE? 0:ans;
    }
}
