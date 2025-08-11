import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode448 {
    public static void main(String[] args) {
        int[] nums = { 4,3,2,7,8,2,3,1};
        System.out.println(Arrays.toString(nums));
        cycle(nums);
        System.out.println(Arrays.toString(nums));
    }
    static List<Integer> cycle(int[] nums){
        int i = 0;
        while(i<  nums.length) {
            int sec =  nums[i]-1;
            if (nums[i] != nums[sec]) {
                swap( nums, i, sec);
            } else {
                i++;
            }
        }
        List<Integer> as = new ArrayList<>();
        for (int j = 0; j < nums.length; j++) {
            if(j != nums[j]-1){
                as.add(j + 1);
            }
        }
        return as;
    }
    static void swap(int[] nums,int first, int sec){
        int temp = nums[first];
        nums[first] = nums[sec];
        nums[sec] = temp;
    }
}
