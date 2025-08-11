import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode442 {
    public static void main(String[] args) {
        int [] nums = {4,3,2,7,8,2,3,1};
        System.out.println(Arrays.toString(nums));
        cycle(nums);
        System.out.println(Arrays.toString(nums));

    }
    static List<Integer> cycle(int[] nums){
        int i = 0;

        while(i<nums.length){
                int a = nums[i]-1;
                if(nums[i] != nums[a]){
                    swap(nums,i,a);
                }
              else{
                i++;
              }
        }
        List<Integer> as = new ArrayList<>();
        for (int j = 0; j < nums.length; j++) {
            if(j != nums[j]-1){
               as.add(nums[j]);
            }
        }
         return as;
    }
    static void swap(int[] nums, int x, int y){
        int z = nums[x];
        nums[x] = nums[y];
        nums[y] = z;
    }
}
