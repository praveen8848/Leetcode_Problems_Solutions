import java.util.Arrays;
//268 leetcode
public class Leetcode3easy {
    public static void main(String[] args) {
        int[] nums = {2,4,0,1};
        sort(nums);
        System.out.println(Arrays.toString(nums));

    }
    static int sort(int[]  nums){
        int i = 0;
        while(i<  nums.length) {
            int sec =  nums[i];
            if ( nums[i] <  nums.length && i !=  nums[i]) {
                swap( nums, i, sec);
            } else {
                i++;
            }
        }
        for (int j = 0; j <  nums.length; j++) {
            if(j !=  nums[j]){
                return j;
            }
        }
        return  nums.length;
    }
    static void swap(int[]  nums,int first, int sec){
        int temp =  nums[first];
         nums[first] =  nums[sec];
         nums[sec] = temp;
    }
}
