import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Leetcode189 {
    public static void main(String[] args) {
         int[] nums = {10,20,30,40};
         int[] arr =  rotate(nums, 2);
        System.out.println(Arrays.toString(arr));
    }
    static int[] rotate(int[] nums, int k){
        k = k% nums.length;
        List<Integer> ig = new ArrayList<>();
        int n  = nums.length;
        for(int i = n-1; i>= n-k; i--){
            ig.add(nums[i]);
        }
        Collections.reverse(ig);
                for( int j = n-1-k; j>=0; j--) {
                    nums[j + k] = nums[j];
                }


        for(int p = 0; p<k; p++){
            nums[p] = ig.get(p);
        }
        return nums;
    }
}
