import java.util.Arrays;

public class leetcode287 {
    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 2, 2};
        System.out.println(Arrays.toString(nums));
        sort(nums);
        System.out.println(Arrays.toString(nums));
    }
   public static int sort(int[] nums){
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
        for(int j = 0; j<nums.length; j++){
            for(int k = 0; k<nums.length; k++){
                while(j != k){
                    if(nums[j] == nums[k]){
                        return nums[k];
                    }
                    break;
                }
            }
        }
        return 0;
    }
    static void swap(int[] nums, int x, int y){
        int z = nums[x];
        nums[x] = nums[y];
        nums[y] = z;
    }
}
